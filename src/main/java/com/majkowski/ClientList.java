package com.majkowski;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Klasa listy klientow.;
 */
public class ClientList {

  /** Lista Klientow. */
  public transient ArrayList<Client>  clients = new ArrayList<>();
  /** Skaner. */
  public transient Scanner scan = new Scanner(System.in);
  /** Wejscie uzytkownika. */
  public transient String input;

  /**
   * Wypisywanie listy klientow.
   */
  public void printClients() {
    System.out.println("Klienci:");
    for (final Client client : clients) {
      System.out.println(client.firstName + " " + client.lastName);
    }
  }

  /**
   * Dodawanie klientow.
   */
  public void addClient() {
    String firstName;
    System.out.println("Podaj imie");
    firstName = scan.nextLine();

    String lastName;
    System.out.println("Podaj nazwisko");
    lastName = scan.nextLine();

    clients.add(new Client(firstName, lastName));
  }

  /**
   * Metoda przenoszaca uzytkownika do menu klienta.
   */
  public void modifyClient() {
    System.out.println("Podaj imie szukanego klienta:");
    final String firstName = scan.nextLine();
    System.out.println("Podaj nazwisko szukanego klienta:");
    final String lastName = scan.nextLine();

    boolean foundClient = false;

    for (final Client client : clients) {
      if (Objects.equals(client.firstName, firstName)
          && Objects.equals(client.lastName, lastName)) {
        foundClient = true;

        input = " ";

        while (!Objects.equals(input, "0")) {
          System.out.println("\n" + client.firstName + " " + client.lastName);
          System.out.println("1 - Dodaj produkt do faktury klienta");
          System.out.println("2 - Usun produkt z faktury klienta");
          System.out.println("3 - Wypisz fakture klienta");
          System.out.println("0 - Wroc do menu\n");

          input = scan.nextLine();
          
          /*Aby zachować wysoką spójność i niskie sprzężenie wywoływane
          są funkcje w klasie client */
          if (Objects.equals(input, "1")) {
            client.addProduct();
          } else if (Objects.equals(input, "2")) {
            client.removeProduct();
          } else if (Objects.equals(input, "3")) {
            client.printInvoice();
          }
        }
      }
    }

    if (!foundClient) {
      System.out.println("Nie znaleziono klienta");
    }
  }
}
