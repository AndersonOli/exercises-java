package com.andersonoli.aulas;

import com.andersonoli.Main;

public class Aula05 extends Main {
    public void question01() {
        System.out.print("Informe o do valor do seu salário bruto [R$]: ");
        double salarioBruto = Double.parseDouble(this.scanner.next());

        double inss;

        if (salarioBruto < 1045) {
            inss = salarioBruto * (7.5 / 100);
        } else if(salarioBruto >= 1045 && salarioBruto < 2089.6){
            inss = salarioBruto * (9.0 / 100);
        } else if(salarioBruto >= 2089.6 && salarioBruto < 3134.4){
            inss = salarioBruto * (12.0 / 100);
        } else if(salarioBruto >= 3134.4 && salarioBruto < 6101.06){
            inss = salarioBruto * (14.0 / 100);
        } else { // above 6101.06
            inss = 671.12;
        }

        System.out.print("Informe o valor gasto com pensão alimentícia [R$]: ");
        double pensaoAlimenticia = Double.parseDouble(this.scanner.next());

        System.out.print("Informe a quantidade de dependentes que vocêS possui: ");
        int quantidadeDependentes = Integer.parseInt(this.scanner.next());

        double baseCalculo = salarioBruto - inss - pensaoAlimenticia - (quantidadeDependentes * 189.59);
        double irrf;

        if (baseCalculo < 1903.98) {
            irrf = 0.0;
        } else if(salarioBruto >= 1903.98 && salarioBruto < 2826.65){
            irrf = baseCalculo * (7.5 / 100) - 142.8;
        } else if(salarioBruto >= 2826.65 && salarioBruto < 3751.05){
            irrf = baseCalculo * (15.0 / 100) - 354.8;
        } else if(salarioBruto >= 3751.05 && salarioBruto < 4664.68){
            irrf = baseCalculo * (22.5 / 100) - 636.13;
        } else { // above 4664.68
            irrf = baseCalculo * (27.5 / 100) - 869.36;
        }

        double salarioLiquido = salarioBruto - inss - irrf;

        System.out.println("\nO valor da sua contribuição para o INSS é: R$" + inss);
        System.out.println("O valor a ser pago ao Imposto de Renda [IRRF]: R$" + irrf);
        System.out.println("O valor do seu salário líquido: R$" + salarioLiquido);
    }

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
