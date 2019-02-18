package pro.bro_programming.application;

import com.mysql.cj.jdbc.Blob;

import java.sql.*;
import java.util.Arrays;

import static pro.bro_programming.application.CTestUtility.ToArrayOfPlotPoints;
import static pro.bro_programming.application.CTestUtility.toHexString;

public class Main {

    public static void main(final String[] args) throws Exception {

            try{
                String myDriver = "com.mysql.cj.jdbc.Driver";
                String myUrl = "jdbc:mysql://localhost/codeingtest?user=jeremy&password=Sandow13";
                Class.forName(myDriver);
                Connection conn = DriverManager.getConnection(myUrl);

                // The SQL Select query
                String query = "SELECT * FROM test";

                // create the statement
                Statement st = conn.createStatement();

                // execute the query and getting result set
                ResultSet rs = st.executeQuery(query);

                // this loops through each blob within the result set
                while (rs.next()) {
                    int id = rs.getInt("trace_id");
                    Blob blob = (Blob) rs.getBlob("trace_data");
                    Timestamp timestamp = rs.getTimestamp("trace_time");

                    // get the binary encoded bytes into a byte array
                    long len = blob.length();
                    byte[] data = blob.getBytes(1, (int) len);

                    // below line can be use for testing purposes just uncomment to use
                    //System.out.println("trace_id = " + id);

                    // input the byte array into method that returns the data converted into
                    // a signed 32 bit integer  that is then divided by 1000 should always
                    // be a negative value.
                    String str = toHexString(data, ",");
                    String[] ArrayOfPlotPoints = ToArrayOfPlotPoints(str);

                    // the line of code below is used for testing uncomment to use
                    System.out.println(Arrays.toString(ArrayOfPlotPoints));
                }
                st.close();
            }
            catch (Exception e){
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }
    }
}
