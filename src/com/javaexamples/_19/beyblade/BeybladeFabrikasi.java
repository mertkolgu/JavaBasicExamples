package com.javaexamples._19.beyblade;

public class BeybladeFabrikasi {

    public Beyblade beybladeUret(String beybladeTuru) {

        if (beybladeTuru.equalsIgnoreCase("Dragon")) {
            return new Dragon("Takao", 800, 300,
                    "Mavi Ejderha", "Kutsal Canvarla Konuşma");
        } else if (beybladeTuru.equalsIgnoreCase("Dranza")) {
            return new Dranza("Kai", 600, 400, "Kırmızı Anka Kuşu");
        } else if (beybladeTuru.equalsIgnoreCase("Drayga")) {
            return new Drayga("Rei", 800, 250, "Beyaz Kaplan");
        } else if (beybladeTuru.equalsIgnoreCase("Draciel")) {
            return new Draciel("Max", 400, 1000, "Kara Kaplumbağa");
        } else {
            return null;
        }
    }
}