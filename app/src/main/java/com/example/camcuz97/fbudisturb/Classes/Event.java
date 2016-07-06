package com.example.camcuz97.fbudisturb.Classes;

import java.sql.Time;
import java.util.ArrayList;

/**
 * Created by camcuz97 on 7/6/16.
 */
public class Event {
    private String location;
    private long uid;
    private User user;
    private ArrayList<Long> alerted;
    private double radius;//or long depending on maps api
    private Time start;//use double if worse comes to worst
    private Time end;
    private String message;
    //private int status; //0 = N/A, 1 = Do, 2 = Do Nots


    public Event(String location, long uid, double radius, Time start, Time end, String message) {
        this.location = (location.equals("")) ? "Default" : location;
        this.uid = uid;
        this.radius = (radius == 0) ? 0 : radius;
        this.start = (start == null) ? null : start;
        this.end = (end == null) ? null : end;
        this.message = (message.equals("")) ? "Text go here" : message;
    }

    public String getLocation() {
        return location;
    }

    public long getUid() {
        return uid;
    }

    public ArrayList<Long> getAlerted() {
        return alerted;
    }

    public double getRadius() {
        return radius;
    }

    public Time getStart() {
        return start;
    }

    public Time getEnd() {
        return end;
    }

    public String getMessage() {
        return message;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public void setAlerted(ArrayList<Long> alerted) {
        this.alerted = alerted;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
