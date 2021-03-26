package com.pradeep.restdatasource.controllers;

import com.pradeep.restdatasource.models.Customer;
import com.pradeep.restdatasource.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = "data")
public class MainSource {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/source",produces = "application/json")
    public ResponseEntity<List<Customer>> getSource(@RequestParam(required = false) boolean updated) throws ParseException {
        return ResponseEntity.ok(customerService.getCustomers(updated));
    }
}
