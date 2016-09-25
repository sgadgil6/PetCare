package com.example.sgadg.petcare;

import java.util.List;

/**
 * Created by Mohit Chauhan on 9/24/2016.
 */

public class Host {
    public String fname;
    public String lname;
    public String profPic;
    public String bio;
    public List<String> pets;
    public String address;
    public String city;
    public Host(String fname,String lname, String address, String city, String profPic, String bio, List<String> pets) {
        this.fname = fname;
        this.bio = bio;
        this.lname = lname;
        this.profPic = profPic;
        this.address = address;
        this.pets = pets;
        this.city = city;
    }
}
