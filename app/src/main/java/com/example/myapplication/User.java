package com.example.myapplication;

import android.widget.SeekBar;

import java.io.Serializable;

public class User implements Serializable {
    private String IDIn;
    private String routeIn;
    private String timeStartIn;
    private String timeEndIn;
    private String trainCarIn;
    private String placeIn;
    public  User(String IDIn, String routeIn, String timeStartIn, String timeEndIn, String  trainCarIn, String placeIn){
        this.IDIn=IDIn;
        this.routeIn=routeIn;
        this.timeStartIn=timeStartIn;
        this.timeEndIn=timeEndIn;
        this.trainCarIn=trainCarIn;
        this.placeIn=placeIn;
    }
    public String getIDIn(){
        return IDIn;
    }
    public void setIDIn(String IDIn){
        this.IDIn=IDIn;
    }

    public String getRouteIn(){
        return routeIn;
    }
    public void setRouteIn(String routeIn){
        this.routeIn=routeIn;
    }
    public String getTimeStartIn(){
        return timeStartIn;
    }
    public void setTimeStartIn(String timeStartIn){
        this.timeStartIn=timeStartIn;
    }
    public String getTimeEndIn(){
        return timeEndIn;
    }
    public void setTimeEndIn(String timeEndIn){
        this.timeEndIn=timeEndIn;
    }
    public String getTrainCarIn(){
        return trainCarIn;
    }
    public void setTrainCarIn(String trainCarIn){
        this.trainCarIn=trainCarIn;
    }
    public String getPlaceIn(){
        return placeIn;
    }
    public void setPlaceIn(String placeIn){
        this.placeIn=placeIn;
    }

}
