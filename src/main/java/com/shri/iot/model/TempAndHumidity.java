package com.shri.iot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;


@Entity
@Table(name="tempandhumidity")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TempAndHumidity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="tempinfahrenheit")
    private float temeratureInFahrenheit;

    @Column(name="humidity")
    private float humidity;

    @Column(name ="datetime")
    @CreationTimestamp
    private Timestamp timeStamp;

    public TempAndHumidity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getTemeratureInFahrenheit() {
        return temeratureInFahrenheit;
    }

    public void setTemeratureInFahrenheit(float temeratureInFahrenheit) {
        this.temeratureInFahrenheit = temeratureInFahrenheit;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }
}
