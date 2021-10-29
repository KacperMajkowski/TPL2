package com.majkowski;


/**
 * Klasa klienta
 */
public class Client {

  String FirstName;
  String LastName;

  Invoice inv = new Invoice();

  Client(String fn, String ln) {
    this.FirstName = fn;
    this.LastName = ln;
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
    inv.print(FirstName, LastName);
  }
}
