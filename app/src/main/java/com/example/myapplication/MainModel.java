package com.example.myapplication;

import java.io.Serializable;

public class MainModel implements Serializable {
    private String name;
    private String number;
    private String imageVIew;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getImageVIew() {
        return imageVIew;
    }

    public void setImageVIew(String imageVIew) {
        this.imageVIew = imageVIew;
    }
}
