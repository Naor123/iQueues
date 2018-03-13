package com.example.naorhen12.iqueues;


public class UserDetails {

    private String name;
    private String lastName;
    private String phone_number;
    private String hat_number;
    private String plate_number;
    private String companyName;

    public UserDetails(String name, String lastName, String phone_number, String hat_number, String plate_number, String companyName) {
        this.name = name;
        this.lastName = lastName;
        this.phone_number = phone_number;
        this.hat_number = hat_number;
        this.plate_number = plate_number;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getHat_number() {
        return hat_number;
    }

    public void setHat_number(String hat_number) {
        this.hat_number = hat_number;
    }

    public String getPlate_number() {
        return plate_number;
    }

    public void setPlate_number(String plate_number) {
        this.plate_number = plate_number;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

