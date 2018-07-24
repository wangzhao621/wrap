package com.example.wrap.mydemo.entity;

import java.util.Optional;

/**
 * Created by admin on 2018/7/9.
 */
public class User {
    private String name;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Optional<Address> getOptionalAddress(){
        return Optional.ofNullable(this.address);
    }
}
