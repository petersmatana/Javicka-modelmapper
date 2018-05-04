package com.example.Javickamodelmapper.models.source;

public class Customer {

    private Name name;

    public Customer() {
    }

    public Customer(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name=" + name +
                '}';
    }
}
