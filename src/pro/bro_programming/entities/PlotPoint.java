package pro.bro_programming.entities;

import java.sql.Time;
import java.sql.Timestamp;

public class PlotPoint {

    private int trace_id;
    private String trace_data;
    private Timestamp trace_time;

    public void setTrace_id(int trace_id){
        this.trace_id = trace_id;
    }
    public int getTrace_id(){
        return trace_id;
    }

    public void setTrace_data(String trace_data) {
        this.trace_data = trace_data;
    }
    public String getTrace_data() {
        return trace_data;
    }

    public void setTrace_time(Timestamp trace_time) {
        this.trace_time = trace_time;
    }
    public Timestamp getTrace_time() {
        return trace_time;
    }
    //public PlotPoint(){}
    /*public PlotPoint(int trace_id, String trace_data, Timestamp trace_time){
        this.setTrace_Id(trace_id);
        this.setTrace_Data(trace_data);
        this.setTrace_Time(trace_time);
    }
*/

}
