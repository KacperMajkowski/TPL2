package com.majkowski;
import java.util.Objects;
import java.util.Scanner;

import java.util.ArrayList;

/**
 * Klasa listy klientow
 */
public class ClientList {

  ArrayList<Client> ClientList = new ArrayList<>();

  Scanner scan = new Scanner(System.in);
  String input;

  /**
   * Wypisywanie listy klientow
   */
  public void printClients()
  {
    System.out.println("Klienci:");
    for(Client client: ClientList){
      System.out.println(client.FirstName + " " + client.LastName);
    }
  }

  /**
   * Dodawanie klientow
   */
  public void addClient()
  {
    String fn, ln;
    System.out.println("Podaj imie");
    fn = scan.nextLine();
    System.out.println("Podaj nazwisko");
    ln = scan.nextLine();

    ClientList.add(new Client(fn, ln));
  }

  /**
   * Metoda przenoszaca uzytkownika do menu klienta
   */
  public void modifyClient()
  {
    System.out.println("Podaj imie szukanego klienta:");
    String fn = scan.nextLine();
    System.out.println("Podaj nazwisko szukanego klienta:");
    String ln = scan.nextLine();

    boolean FoundClient = false;

    for(Client client: ClientList)
    {
      if(Objects.equals(client.FirstName, fn) && Objects.equals(client.LastName, ln))
      {
        FoundClient = true;

        input = " ";

        while(!Objects.equals(input, "0"))
        {
          System.out.println("\n" + client.FirstName + " " + client.LastName);
          System.out.println("1 - Dodaj produkt do faktury klienta");
          System.out.println("2 - Usun produkt z faktury klienta");
          System.out.println("3 - Wypisz fakture klienta");
          System.out.println("0 - Wroc do menu\n");

          input = scan.nextLine();

          if(Objects.equals(input, "1")) {
            client.addProduct();
          }
          else if(Objects.equals(input, "2")) {
            client.removeProduct();
          }
          else if(Objects.equals(input, "3")) {
            client.printInvoice();
          }
        }
      }
    }

    if(!FoundClient)
    {
      System.out.println("Nie znaleziono klienta");
    }
  }
}
