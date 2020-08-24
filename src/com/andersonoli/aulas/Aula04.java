package com.andersonoli.aulas;

import com.andersonoli.Main;

public class Aula04 extends Main {
    public void question1(){
        System.out.println("Impar ou par?");
        System.out.print(":: ");
        String number = this.scanner.nextInt() % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(number);
    }

    public void question2(){
        float media = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Informe a " + i + "° nota: ");
            media += this.scanner.nextFloat();
        }

        media = media/3;

        if (media < 3) {
            System.out.println("O aluno em questão está reprovado.\nSua média é: " + media);
        } else if (media >= 3 && media < 7){
            System.out.println("O aluno em questão está de Exame.");
            System.out.println("Sua média é: " + media);
            System.out.println("O aluno necessita tirar: " + (12
                    -media));
        } else {
            System.out.println("O aluno em questão está aprovado.\nSua média é: " + media);
        }
    }

    public void question3(){
        System.out.print("Informe o valor do salário mínimo [R$]: ");
        double salarioMinimo = this.scanner.nextDouble();

        System.out.print("Informe o número de horas trabalhadas [h]: ");
        double horasTrabalhadas = this.scanner.nextDouble();

        System.out.print("Informe o número de dependentes que você possui: ");
        int quantidadeDependentes = this.scanner.nextInt();

        System.out.print("Informe a quantidade de horas extras trabalhadas [h]: ");
        double horasExtrasTrabalhadas = this.scanner.nextDouble();

        double valorHoraTrabalhada = salarioMinimo / 5;
        double salarioMensal = salarioMinimo * horasTrabalhadas;
        double valorDependentes = quantidadeDependentes * 32;
        double valorHoraExtra = (valorHoraTrabalhada * 1.5) * horasExtrasTrabalhadas;
        double salarioBruto = salarioMensal + valorDependentes + valorHoraExtra;
        double valorImposto = 0.0;

        // cálculo do imposto de renda:IRRF
        if(salarioBruto >= 200 && salarioBruto <= 500){
            valorImposto = salarioBruto * 0.01;
        } else if(salarioBruto > 500){
            valorImposto = salarioBruto * 0.01;
        }

        double salarioLiquido = salarioBruto - valorImposto;

        //valor da gratificacao
        double valorGratificacao = salarioLiquido >= 350 ? 100.0 : 50.0;
        double salarioFinal = salarioLiquido + valorGratificacao;

        System.out.println("Seu salário final é: R$" + salarioFinal);
    }
}

















