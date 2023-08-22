package com.imc.demo.Model;

public class M_IMC {
    private double calculo;
    private String categoria;

    public M_IMC(double calculo, String categoria) {
        this.categoria = categoria;
        this.calculo = calculo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

}
