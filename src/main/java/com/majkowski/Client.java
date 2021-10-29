package com.majkowski;
import java.util.Scanner;

public class Client {

  String FirstName;
  String LastName;

  Invoice inv = new Invoice();

  Client(String fn, String ln) {
    this.FirstName = fn;
    this.LastName = ln;
  }

  Scanner scan = new Scanner(System.in);

  public void AddProduct()
  {
    inv.AddProduct();
  }

  public void RemoveProduct()
  {
    inv.RemoveProduct();
  }

  public void printInvoice()
  {
    inv.print(FirstName, LastName);
  }
}
