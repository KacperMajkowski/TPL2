package com.majkowski;

/**
 * Glowna klasa aplikacji
 */
public class App {

    /**
     * Klasa main programu
     * @param args argumenty(nie trzeba nic podawac)
     */
    public static void main(final String[] args) {
        System.out.println("\nWitaj uzytkowniku!");

        final Loop loop = new Loop();
        loop.start();
    }
}
