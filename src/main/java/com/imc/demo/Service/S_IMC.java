package com.imc.demo.Service;

import com.imc.demo.Model.M_IMC;


public class S_IMC {
    public static M_IMC CalculoIMC(double altura, double peso){

        double calculo = 0;
        String categoria;

        calculo = peso / Math.pow(altura, 2);

        if(calculo < 18.5) {
            categoria = "Você está abaixo do peso";
        } else if (calculo < 24.9) {
            categoria = "Você está no peso ideal";
        } else if (calculo < 30) {
            categoria = "Você está no sobrepeso";
        } else if (calculo < 34.9) {
            categoria = "Você está na obesidade grau I";
        } else if (calculo < 40) {
            categoria = "Você está na obesidade grau II (severa)";
        } else {
            categoria = "Você está na obesidade grau III (mórbida)";
        }

        M_IMC m_imc = new M_IMC(calculo, categoria);
        return m_imc;
    }
}
