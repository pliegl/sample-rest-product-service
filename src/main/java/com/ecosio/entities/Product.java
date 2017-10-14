package com.ecosio.entities;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/**
 *
 */
@Data
@Builder
public class Product {


  private String id;
  private String name;
  private BigDecimal price;




}
