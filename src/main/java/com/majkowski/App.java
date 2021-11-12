package com.majkowski;

/**
 * Glowna klasa aplikacji.
 */
public final class App {
    /**
     * Klasa main programu.
     *
     * @param args argumenty (nie trzeba nic podawac)
     */
    public static void main(final String[] args) {
        System.out.println("\nWitaj uzytkowniku!");
        final Loop loop = new Loop();
        loop.start();
    }
    
    private App() {
        throw new
            UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}
