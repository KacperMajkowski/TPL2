package com.majkowski;

/**
 * Klasa produktu - elementu faktury
 */
public class Product {

  String name;
  int price;
  int count;

  Product(String name, int price, int count){
    this.name = name;
    this.price = price;
    this.count = count;
  }
}
