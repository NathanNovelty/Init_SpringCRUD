package net.javaguides.dao;

import net.javaguides.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getListCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}
