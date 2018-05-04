package com.example.Javickamodelmapper;

import com.example.Javickamodelmapper.models.destination.OrderDTO;
import com.example.Javickamodelmapper.models.source.Order;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class CustomMapper {

    private ModelMapper modelMapper;

    public CustomMapper() {
        this.modelMapper = new ModelMapper();

        modelMapper.addMappings(new PropertyMap<Order, OrderDTO>() {
            protected void configure() {
                map().setBillingCity(source.getBillingAddress().getStreet());
            }
        });

        modelMapper.addMappings(new PropertyMap<Order, OrderDTO>() {
            protected void configure() {
                map().setBillingStreet(source.getBillingAddress().getCity());
            }
        });

    }

    public ModelMapper getModelMapper() {
        return this.modelMapper;
    }

}
