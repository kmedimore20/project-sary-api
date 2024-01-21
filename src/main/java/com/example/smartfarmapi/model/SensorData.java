package com.example.smartfarmapi.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "sensor_data")
public class SensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sensor_name")
    private String sensorName;

    @Column(name = "sensor_type")
    private String sensorType;

    @Column(name = "temperature")
    private Double temperature;

    @Column(name = "humidity")
    private Double humidity;

    @Column(name = "light_status")
    private String lightStatus;

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public Double getTemperature(){
        return temperature;
    }

    public void setTemp(Double temp) {
        this.temperature = temp;
    }

    public Double getHumidity(){
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public String getLightStatus(){
        return lightStatus;
    }

    public void setLightStatus(String lightStatus) {
        this.lightStatus = lightStatus;
    }

    /*@Override
    public String toString() {
        return "SensorData{" +
                "id=" + id +
                "name=" + name +
                '}';
    }*/
}