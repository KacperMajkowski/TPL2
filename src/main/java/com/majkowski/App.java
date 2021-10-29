package com.majkowski;
import jdk.jpackage.internal.Log;

/**
 * Glowna klasa aplikacji
 */
public class App {

    /**
     * Klasa main programu
     * @param args argumenty(nie trzeba nic podawac)
     */
    public static void main(String[] args) {
        System.out.println("\nWitaj uzytkowniku!");

        Loop loop = new Loop();
        loop.Start();
    }
}
