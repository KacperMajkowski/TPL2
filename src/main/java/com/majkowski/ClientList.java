package com.majkowski;
import java.util.Scanner;

import java.util.ArrayList;

public class ClientList {

  ArrayList<Client> ClientList = new ArrayList<>();

  Scanner scan = new Scanner(System.in);
  String input;

  public void PrintClients()
  {
    System.out.println("Klienci:");
    for(Client client: ClientList){
      System.out.println(client.FirstName + " " + client.LastName);
    }
  }

  public void AddClient()
  {
    String fn, ln;
    System.out.println("Podaj imie");
    fn = scan.nextLine();
    System.out.println("Podaj nazwisko");
    ln = scan.nextLine();

    ClientList.add(new Client(fn, ln));
  }

}
