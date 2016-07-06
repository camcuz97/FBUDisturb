package com.example.camcuz97.fbudisturb.Classes;

import java.util.ArrayList;

/**
 * Created by camcuz97 on 7/6/16.
 */
public class User {
    private String name;
    private String username;
    private String imageUrl;
    private String location;
    private long uid;
    private PhoneNumber phoneNumber; //possible seperate class
    private ArrayList<Long> favorites;
    private ArrayList<Long> friends;
    private ArrayList<Long> muted;
    private int status; //0 = N/A, 1 = Do, 2 = Do Not


    public User(String name, String username, PhoneNumber phoneNumber) {
        this.name = name;
        this.username = username;
        this.phoneNumber = phoneNumber;
        imageUrl = "@drawable/ic_launcher";
        favorites = new ArrayList<Long>();
        friends = new ArrayList<Long>();
        muted = new ArrayList<Long>();
        //uid needs to be stored on parse
        status = 0;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getLocation() {
        return location;
    }

    public long getUid() {
        return uid;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Long> getFavorites() {
        return favorites;
    }

    public ArrayList<Long> getFriends() {
        return friends;
    }

    public ArrayList<Long> getMuted() {
        return muted;
    }

    public int getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFavorites(ArrayList<Long> favorites) {
        this.favorites = favorites;
    }

    public void setFriends(ArrayList<Long> friends) {
        this.friends = friends;
    }

    public void setMuted(ArrayList<Long> muted) {
        this.muted = muted;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
