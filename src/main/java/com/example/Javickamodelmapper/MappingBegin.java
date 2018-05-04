package com.example.Javickamodelmapper;

import com.example.Javickamodelmapper.models.destination.OrderDTO;
import com.example.Javickamodelmapper.models.source.Address;
import com.example.Javickamodelmapper.models.source.Customer;
import com.example.Javickamodelmapper.models.source.Name;
import com.example.Javickamodelmapper.models.source.Order;
import org.modelmapper.ModelMapper;

public class MappingBegin {

    private Address address;
    private Name name;
    private Customer customer;
    private Order order;

    public MappingBegin() {
        this.address = new Address("ulice - v haji", "mesto - krno");

        this.name = new Name("first name", "last name");

        this.customer = new Customer(this.name);

        this.order = new Order();
        this.order.setCustomer(this.customer);
        this.order.setBillingAddress(this.address);
    }

    public void mapping() {
        ModelMapper modelMapper = new ModelMapper();
        OrderDTO orderDTO = modelMapper.map(this.order, OrderDTO.class);

        System.out.println(orderDTO);
    }

    public void customMapping() {
        ModelMapper modelMapper = new CustomMapper().getModelMapper();

        OrderDTO orderDTO = modelMapper.map(this.order, OrderDTO.class);
        System.out.println(orderDTO);
    }

}
