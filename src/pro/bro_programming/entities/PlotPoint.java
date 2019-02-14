package pro.bro_programming.entities;

import org.hibernate.annotations.Table;
import org.hibernate.annotations.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;


@Entity
//@Table(name = "test_data")
public class PlotPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int trace_id;
    private String trace_data;
    private Timestamp trace_time;

    public PlotPoint(){}

    public PlotPoint(String trace_data, Timestamp trace_time) {
       // this.setTrace_Data(trace_data);
       // this.setTrace_Time(trace_time);
    }

    // getters and setters for data and time


}
