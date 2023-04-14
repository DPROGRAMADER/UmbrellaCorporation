package org.example;

public class VirusT extends VirusProgenitor {

    private double ValorUnitarioVirus=3000.0;

    public VirusT(String nombre, String fabricante) {
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
