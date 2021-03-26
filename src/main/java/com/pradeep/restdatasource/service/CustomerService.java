package com.pradeep.restdatasource.service;

import com.pradeep.restdatasource.models.Customer;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CustomerService {

    public List<Customer> getCustomers(boolean updated) throws ParseException {
        List<Customer> customerList = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        if(updated){
            Customer customer6 = new Customer(
                    "006","Brad2","address six",new Date());
            customerList.add(customer6);
            return customerList;
        }

        Customer customer1 = new Customer(
                "001","Pradeep","address one",simpleDateFormat.parse("2021-01-01 10:50:45"));
        Customer customer2 = new Customer(
                "002","Kevin","address two",simpleDateFormat.parse("2021-01-01 10:50:45"));
        Customer customer3 = new Customer(
                "003","Joe","address three",simpleDateFormat.parse("2021-01-01 10:50:45"));
        Customer customer4 = new Customer(
                "004","John","address four",simpleDateFormat.parse("2021-01-01 10:50:45"));
        Customer customer5 = new Customer(
                "005","Brad","address five",simpleDateFormat.parse("2021-01-01 10:50:45"));
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
        return customerList;
    }
}
