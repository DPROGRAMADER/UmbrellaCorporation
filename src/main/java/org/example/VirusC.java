package org.example;

public class VirusC extends VirusProgenitor {


    private double ValorUnitarioVirus=40000.0;

    public VirusC(String nombre, String fabricante) {
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
