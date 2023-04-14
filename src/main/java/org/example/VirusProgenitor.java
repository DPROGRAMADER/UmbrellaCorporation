package org.example;

public abstract class VirusProgenitor {

    private String nombre;
    private String Fabricante;
    private Double PrecioUnitarioVirus;

    public abstract double ValorUnitarioVirus();
    public abstract double CalcularValorTotalVirus(Integer cantidad);

    public VirusProgenitor(String nombre, String fabricante) {
        this.nombre = nombre;
        this.Fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }
}
