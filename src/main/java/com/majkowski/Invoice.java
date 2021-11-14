package com.majkowski;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Klasa faktury.
 */
public class Invoice {

  /** Lista produktow. */
  public transient ArrayList<Product> products = new ArrayList<>();

  /** Skaner. */
  public transient Scanner scan = new Scanner(System.in);

  /**
   * Dodawanie produktow.
   */
  public void addProduct() {

    String name;
    System.out.println("Podaj nazwe produktu");
    name = scan.nextLine();

    double price;
    System.out.println("Podaj cene produktu");
    price = Double.parseDouble(scan.nextLine());

    int count;
    System.out.println("Podaj ilosc produktu");
    count = Integer.parseInt(scan.nextLine());

    products.add(new Product(name, price, count));
  }

  /**
   * Usuwanie produktu.
   */
  public void removeProduct() {
    String name;

    System.out.println("Podaj nazwe produktu");
    name = scan.nextLine();

    final ArrayList<Product> productsToRemove = new ArrayList<>();

    for (final Product p : products) {
      if (Objects.equals(p.name, name)) {
        productsToRemove.add(p);
      }
    }
    products.removeAll(productsToRemove);
  }

  /**
   * Drukowanie faktury.
   *
   * @param firstName Imie klienta.
   * @param lastName Nazwisko klienta.
   */
  public void print(final String firstName, final String lastName) {
    int total = 0;
    System.out.println("\n====================");
    System.out.println(firstName + " " + lastName);
    for (final Product p : products) {
      System.out.println("Produkt: " + p.name + "  Cena: " + p.price + "zl  Ilosc: " + p.count);
      total += p.price * p.count;
    }
    System.out.println("\nCalosc: " + total + "zl");
    System.out.println("====================");
  }
}
