package com.majkowski;
import java.util.Objects;
import java.util.Scanner;


/**
 * Klasa odpowiedzialna za petle dzialania programu
 */
public class Loop {

  /** Lista klientow */
  public ClientList list = new ClientList();

  /** Skaner */
  public Scanner scan = new Scanner(System.in);

  /** Wejscie uzytkownika */
  public String input = " ";

  /**
   * Funkcja rozpoczynajaca prace programu
   */
  public void start() {

    while(!Objects.equals(input, "0")) {
      System.out.println("\n1 - Dodaj klienta");
      System.out.println("2 - Wypisz wszytkich klientow");
      System.out.println("3 - Wybierz klienta do modyfikacji");
      System.out.println("0 - Wyjscie\n");

      input = scan.nextLine();

      if(Objects.equals(input, "1")) {
        list.addClient();
      }
      else if(Objects.equals(input, "2")) {
        list.printClients();
      }
      else if(Objects.equals(input, "3")) {
        list.modifyClient();
      }
    }
  }
}
