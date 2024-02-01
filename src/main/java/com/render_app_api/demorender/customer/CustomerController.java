package com.render_app_api.demorender.customer;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
  private static final List<Customer> CUSTOMERS = List.of(
    new Customer(1L, "Marien", "Tapande", "marien@gmail.com"),
    new Customer(2L, "carene", "Tapande", "Carene@gmail.com"),
    new Customer(3L, "Elisa", "Tapande", "elisa@gmail.com"),
    new Customer(4L, "Mathis", "Tapande", "mathis@gmail.com"),
    new Customer(5L, "Venius", "Tapande", "nevius@gmail.com")
  );
  

  @GetMapping
  public List<Customer> findAllCustomers(){
    return CUSTOMERS;
  }
}
