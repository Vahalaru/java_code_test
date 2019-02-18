package pro.bro_programming.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;


@Entity
//@Table(name = "test_data")
public class PlotPointOld {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int trace_id;
    private Blobs trace_data;
    private Timestamp trace_time;

    public PlotPointOld(){}

    public PlotPointOld(Blobs trace_data, Timestamp trace_time, Blobs trace_data1) {
       // this.setTrace_Data(trace_data);
       // this.setTrace_Time(trace_time);
        this.trace_data = trace_data1;
    }

    // getters and setters for data and time


}
