package com.imc.demo.Controller;

import com.imc.demo.Model.M_IMC;
import com.imc.demo.Service.S_IMC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.math.BigDecimal;
import java.math.RoundingMode;


@Controller
public class C_IMC {
    @GetMapping("/")
    public String getIMC(){
        return "index";
    }

    @PostMapping("/")
    public String postIMC(@RequestParam("altura") double altura,
                          @RequestParam ("peso") double peso,
                          Model model) {
        M_IMC calculo = S_IMC.CalculoIMC(altura, peso);
        BigDecimal resultadoArredondado = BigDecimal.valueOf(calculo.getCalculo()).setScale(2, RoundingMode.HALF_UP);
        model.addAttribute("resultadoArredondado", resultadoArredondado);
        model.addAttribute("categoria", calculo.getCategoria());

        return "index";
    }




}
