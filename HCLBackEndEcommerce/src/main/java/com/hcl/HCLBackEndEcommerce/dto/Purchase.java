package com.hcl.HCLBackEndEcommerce.dto;

import com.hcl.HCLBackEndEcommerce.entity.Address;
import com.hcl.HCLBackEndEcommerce.entity.Customer;
import com.hcl.HCLBackEndEcommerce.entity.Order;
import com.hcl.HCLBackEndEcommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
