package com.hcl.HCLBackEndEcommerce.dao;

import com.hcl.HCLBackEndEcommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
