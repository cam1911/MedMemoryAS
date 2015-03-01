package com.example.memorymed.model;

import android.graphics.Bitmap;

/**
 * Created by Cameron on 2/5/2015.
 */
public class Doctor {

    private String name;
    private Bitmap image;
    private String email;
    private String address;

    public Doctor(String name, String email, String address, Bitmap image) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
