package com.andersonoli.aulas;

import com.andersonoli.Main;

public class Aula05 extends Main {
    public void question01(){}

    public void question02(){
        System.out.print("Informe seu peso [Kg]: ");
        double peso = Double.parseDouble(this.scanner.next());

        System.out.print("Informe sua altura [m]: ");
        double altura = Double.parseDouble(this.scanner.next());

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);
        System.out.print("Laudo: ");

        if(imc < 15){
            System.out.println("Extremamente abaixo do peso");
        } else if(imc >= 15 && imc < 16){
            System.out.println("Gravemente abaixo do peso");
        } else if(imc >= 16 && imc < 18.5){
            System.out.println("Abaixo o peso ideal");
        } else if(imc >= 18.5 && imc < 25){
            System.out.println("Faixa de peso ideal");
        } else if(imc >= 25 && imc < 30){
            System.out.println("Sobrepeso");
        } else if(imc >= 30 && imc < 35){
            System.out.println("Obesidade grau I");
        } else if(imc >= 35 && imc < 40){
            System.out.println("Obesidade grau II (grave)");
        } else { // above 40
            System.out.println("Obesidade grau III (mórbida)");
        }
    }
}
