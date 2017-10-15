package com.ecosio.controllers;

import com.ecosio.entities.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

/**
 * Serves a list of sample products
 */
@RestController
@RequestMapping("/test-api")
public class ProductController {


  private List<Product> products = new LinkedList<>();

  @RequestMapping(method = RequestMethod.GET, value = "/products")
  public List<Product> getProducts () {
    return products;
  }



  @PostConstruct
  private void loadDummyData() {
    products.add(Product.builder().id("1").name("Apple").price(new BigDecimal("0.7")).build());
    products.add(Product.builder().id("2").name("Pear").price(new BigDecimal("0.8")).build());
    products.add(Product.builder().id("3").name("Orange").price(new BigDecimal("0.4")).build());
  }

}
