package com.example.Javickamodelmapper.models.source;

public class Order {

    private Customer customer;
    private Address billingAddress;

    public Order() {
    }

    public Order(Customer customer, Address billingAddress) {
        this.customer = customer;
        this.billingAddress = billingAddress;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", billingAddress=" + billingAddress +
                '}';
    }
}
