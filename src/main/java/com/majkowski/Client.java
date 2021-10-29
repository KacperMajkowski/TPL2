package com.majkowski;


/**
 * Klasa klienta
 */
public class Client {

  /** Imie klienta */
  final public transient String firstName;
  /** Nazwisko klienta */
  final public transient String lastName;

  /** Faktura klienta */
  public transient Invoice inv = new Invoice();

  /** Konstruktor klienta */
  public Client(final String firstName, final String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Dodawanie produktu
   */
  public void addProduct()
  {
    inv.addProduct();
  }

  /**
   * Usuwanie produktu
   */
  public void removeProduct()
  {
    inv.removeProduct();
  }

  /**
   * Drukowanie faktury
   */
  public void printInvoice()
  {
    inv.print(firstName, lastName);
  }
}
