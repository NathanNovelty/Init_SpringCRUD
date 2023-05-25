package net.javaguides.service;

import net.javaguides.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomer();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}
