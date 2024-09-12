package com.example.csci318.hotelbooking.model.event;

import com.example.csci318.hotelbooking.model.Hotel;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class HotelEvent {
    @Id
    @GeneratedValue
    private long Id;
    @Column
    private String eventName;
    @Column
    private String name;
    @Column
    private String location;
    @Column
    private String description;
    @Column
    private double pricePerNight;

    public HotelEvent(){}

    public String getEventName(){
        return eventName;
    }

    public void setEventName(String eventname){
        this.eventName = eventname;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getPricePerNight(){
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight){
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString(){
        return "HotelEvent{" +
                "event_name=" + eventName + '\'' +
                ", name=" + name + '\'' +
                ", location=" + location + '\'' +
                ", description=" + description + '\'' +
                ", price_per_night" + pricePerNight +
                '}';
    }
}
