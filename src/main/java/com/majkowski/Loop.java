package com.majkowski;
import java.util.Objects;
import java.util.Scanner;


/**
 * Klasa odpowiedzialna za petle dzialania programu
 */
public class Loop {

  ClientList list = new ClientList();

  Scanner scan = new Scanner(System.in);
  String input = " ";

  /**
   * Funkcja rozpoczynajaca prace programu
   */
  public void Start() {

    while(!Objects.equals(input, "0")) {
      System.out.println("\n1 - Dodaj klienta");
      System.out.println("2 - Wypisz wszytkich klientow");
      System.out.println("3 - Wybierz klienta do modyfikacji");
      System.out.println("0 - Wyjscie\n");

      input = scan.nextLine();

      if(Objects.equals(input, "1")) {
        list.AddClient();
      }
      else if(Objects.equals(input, "2")) {
        list.PrintClients();
      }
      else if(Objects.equals(input, "3")) {
        list.ModifyClient();
      }
    }
  }
}
