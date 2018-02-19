package com.example.naorhen12.iqueues;


public class UserDetails {

    public String name;
    public String lastName;
    public String phone_number;
    public String hat_number;
    public String plate_number;
    public String companyName;

    public UserDetails(String name,String lName,String phone,String hatNum,String plate,String company)
    {
        this.name=name;
        this.lastName=lName;
        this.phone_number=phone;
        this.hat_number=hatNum;
        this.plate_number=plate;
        this.companyName=company;
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

