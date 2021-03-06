package com.ecosio.entities;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/**
 * Sample product structure. Note that getters and setter are auto-generated by Lombok
 */
@Data
@Builder
public class Product {


  private String id;
  private String name;
  private BigDecimal price;




}
