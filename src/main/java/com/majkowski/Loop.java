package com.majkowski;
import java.util.Objects;
import java.util.Scanner;

public class Loop {

  ClientList list = new ClientList();

  Scanner scan = new Scanner(System.in);
  String input;

  public void Start() {

    while(!Objects.equals(input, "e")) {
      System.out.println("\nDodaj klienta - n");
      System.out.println("Wypisz wszytkich klientow - p");
      System.out.println("Wyjscie - e\n");

      input = scan.nextLine();

      if(Objects.equals(input, "n")) {
        list.AddClient();
      }
      else if(Objects.equals(input, "p")) {
        list.PrintClients();
      }
    }
  }
}
