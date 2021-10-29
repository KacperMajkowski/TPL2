package com.majkowski;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Klasa faktury
 */
public class Invoice {

  ArrayList<Product> products = new ArrayList<>();

  Scanner scan = new Scanner(System.in);

  String name;
  int price;
  int count;

  /**
   * Dodawanie produktow
   */
  public void AddProduct()
  {
    System.out.println("Podaj nazwe produktu");
    name = scan.nextLine();
    System.out.println("Podaj cene produktu");
    price = Integer.parseInt(scan.nextLine());
    System.out.println("Podaj ilosc produktu");
    count = Integer.parseInt(scan.nextLine());

    products.add(new Product(name, price, count));
  }

  /**
   * Usuwanie produktu
   */
  public void RemoveProduct()
  {
    System.out.println("Podaj nazwe produktu");
    name = scan.nextLine();

    ArrayList<Product> ProductsToRemove = new ArrayList<>();

    for(Product p: products)
    {
      if(Objects.equals(p.name, name))
      {
        ProductsToRemove.add(p);
      }
    }
    products.removeAll(ProductsToRemove);
  }

  /**
   * Drukowanie faktury
   * @param fn Imie klienta
   * @param ln Nazwisko klienta
   */
  public void print(String fn, String ln)
  {
    int total = 0;
    System.out.println("\n====================");
    System.out.println(fn + " " + ln);
    for(Product p: products)
    {
      System.out.println("Produkt: " + p.name + "  Cena: " + p.price + "zl  Ilosc: " + p.count);
      total += p.price * p.count;
    }
    System.out.println("\nCalosc: " + total + "zl");
    System.out.println("====================");
  }
}
