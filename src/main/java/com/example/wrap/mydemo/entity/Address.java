package com.example.wrap.mydemo.entity;

/**
 * Created by admin on 2018/7/9.
 */
public class Address {
    private String country;
    private String province;

    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public Address(String country, String province) {
        this.country = country;
        this.province = province;

    }
}
