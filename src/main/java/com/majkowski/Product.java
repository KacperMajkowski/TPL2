package com.majkowski;

/**
 * Klasa produktu - elementu faktury.
 */
public class Product {

  /** Nazwa produktu. */
  public final transient String name;
  /** Cena produktu. */
  public final transient double price;
  /** Ilosc produktu. */
  public final transient int count;

  /** Kostruktor produktu. */
  public Product(final String name,  final double price, final int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }
}
