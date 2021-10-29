package com.majkowski;


/**
 * Glowna klasa aplikacji
 */
public class App {

    /**
     * Klasa main programu
     * @param args argumenty(nie trzeba nic podawac)
     */
    public static void main(String[] args) {
        System.out.println("Witaj uzytkowniku!\n");

        Loop loop = new Loop();
        loop.Start();
    }
}
