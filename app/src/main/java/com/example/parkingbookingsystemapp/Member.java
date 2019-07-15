package com.example.parkingbookingsystemapp;

import android.widget.Spinner;

public class Member {
    private  String name;
    private Integer vehical;
    private long phone;
    private String spinnerslot;



    public Member() {
        // Default constructor required for calls to DataSnapshot.getValue(Member.class)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVehical() {
        return vehical;
    }

    public void setVehical(Integer vehical) {
        this.vehical = vehical;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getSpinnerslot() {
        return spinnerslot;
    }

    public void setSpinnerslot(String spinnerslot) {
        this.spinnerslot = spinnerslot;
    }


}
