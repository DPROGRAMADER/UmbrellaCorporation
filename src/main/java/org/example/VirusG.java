package org.example;

public class VirusG extends VirusProgenitor{

    private double ValorUnitarioVirus=40000.0;

    public VirusG(String nombre, String fabricante) {
        super(nombre, fabricante);
    }
    @Override
    public double ValorUnitarioVirus() {
        return ValorUnitarioVirus;
    }
    @Override
    public double CalcularValorTotalVirus(Integer cantidad) {
        return ValorUnitarioVirus*cantidad;
    }
}

