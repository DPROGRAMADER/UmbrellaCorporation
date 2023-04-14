package org.example;

public class CompraVirus {
    public static void main(String[] args) {

        // Crear virus T
        VirusT virusT = new VirusT("VirusT-001", "UMBRELLA");

        int cantidadT = 20;
        double valorTotalT = virusT.CalcularValorTotalVirus(cantidadT);
        System.out.println("Valor total de " + cantidadT + " virus T sin descuento: " + valorTotalT);

        // Crear virus G
        VirusG virusG = new VirusG("VirusG-001", "UMBRELLA");

        int cantidadG = 15;
        double valorTotalG = virusG.CalcularValorTotalVirus(cantidadG);
        System.out.println("Valor total de " + cantidadG + " virus G sin descuento: " + valorTotalG);

        // Crear virus C
        VirusC virusC = new VirusC("VirusC-001", "UMBRELLA");

        int cantidadC = 30;
        double valorTotalC = virusC.CalcularValorTotalVirus(cantidadC);
        System.out.println("Valor total de " + cantidadC + " virus C sin descuento: " + valorTotalC);
            }
        }