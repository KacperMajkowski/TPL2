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
  public void AddProduct()
  {
    inv.AddProduct();
  }

  /**
   * Usuwanie produktu
   */
  public void RemoveProduct()
  {
    inv.RemoveProduct();
  }

  /**
   * Drukowanie faktury
   */
  public void printInvoice()
  {
    inv.print(FirstName, LastName);
  }
}
