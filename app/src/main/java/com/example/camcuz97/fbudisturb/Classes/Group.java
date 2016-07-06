package com.example.camcuz97.fbudisturb.Classes;

import java.util.ArrayList;

/**
 * Created by camcuz97 on 7/6/16.
 */
public class Group {
    private ArrayList<Long> users;
    private String name;
    private boolean isPublic;

    public Group(ArrayList<Long> users, String name, boolean isPublic) {
        this.users = users;
        this.name = name;
        this.isPublic = isPublic ? true : false;
    }

    public ArrayList<Long> getUsers() {
        return users;
    }

    public String getName() {
        return name;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setUsers(ArrayList<Long> users) {
        this.users = users;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }
}
