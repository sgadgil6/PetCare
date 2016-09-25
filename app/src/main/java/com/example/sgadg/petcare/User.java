package com.example.sgadg.petcare;

import java.util.Map;

/**
 * Created by Mohit Chauhan on 9/24/2016.
 */

public class User {
    public String fname;
    public String lname;
    public String profPic;
    public String bio;
    public Map<String, Integer> pets;
    public String address;
    public String city;

    public User(String fname,String lname, String address, String city, String profPic, String bio, Map<String, Integer> pets) {
        this.fname = fname;
        this.bio = bio;
        this.lname = lname;
        this.profPic = profPic;
        this.address = address;
        this.pets = pets;
        this.city = city;
    }
}
