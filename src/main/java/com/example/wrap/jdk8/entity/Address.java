package com.example.wrap.jdk8.entity;

import lombok.Data;

/**
 * Created by 12232 on 2017/12/11.
 */
@Data
public class Address {
    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    private String country;
    private String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }
}
