package pro.bro_programming.application;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class CustomDatasource {

    // jdbc driver name and db url
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/codingtest";

    // db credentials
    static final String USER = "jeremy";
    static final String PASS = "Sandow13";
    private static DataSource dataSource;
    private static final BasicDataSource basicDataSource;

    static {

    }

}
