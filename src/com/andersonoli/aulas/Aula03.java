package com.andersonoli.aulas;

import com.andersonoli.Main;

import java.sql.SQLOutput;

public class Aula03 extends Main {
    public void question1(){
        float horasExtras = 0;

        System.out.print("Informe o número de horas trabalhadas: ");
        float horasTrabalhadas = this.scanner.nextFloat();

        System.out.print("Informe o valor do salário mínimo: ");
        float salarioMinimo = this.scanner.nextFloat();

        System.out.print("Você fez horas extras? [s/n]: ");
        String fezExtra = this.scanner.next();

        if(fezExtra.toLowerCase().contains("s")) {
            System.out.print("Informe a quantidade de horas extras trabalhadas: ");
            horasExtras = this.scanner.nextFloat();
        }

        float valorHtrabalhada = salarioMinimo / 8;
        float valorHextra = horasExtras > 0 ? salarioMinimo / 4 : 0;
        float salarioBruto = valorHtrabalhada * horasTrabalhadas;
        float quantiaExtra = horasExtras * valorHextra;
        float salarioLiquido = salarioBruto + quantiaExtra;

        System.out.println("\nO salário a receber é: R$" + salarioLiquido);
    }

    public void question2(){
        System.out.print("Informe o peso do saco de ração [Kg]: ");
        float pesoSacoRacao = this.scanner.nextFloat() * 1000;

        System.out.println("Informe a quantidade em gramas de ração necessária para cada gato.");

        // quantidade de ração consumida pelo gato 1
        System.out.print("Gato 1 [g]: ");
        float quantidadeGatoUm = this.scanner.nextFloat();

        // quantidade de ração consumida pelo gato 2
        System.out.print("Gato 2 [g]: ");
        float quantidadeGatoDois = this.scanner.nextFloat();

        // total a ser consumido em 5 dias
        float totalConsumido = (quantidadeGatoUm + quantidadeGatoDois) * 5;

        float restante = pesoSacoRacao - totalConsumido;

        if(restante < 0){
            System.out.println("\nApós o período de 5 dias os gatos consumirão: " + totalConsumido + "g");
            System.out.println("O seu atual saco de ração não é suficiente, você precisa de mais " + (-1 * (restante / 1000)) + "Kg");
        } else {
            System.out.println("\nApós o período de 5 dias restará: " + restante + "Kg");
        }
    }  public void question4(){
        System.out.print("Digite o número de horas: ");
        int horas = this.scanner.nextInt();

        System.out.print("Digite o número de minutos: ");
        float minutos = this.scanner.nextFloat();

        float horasConvertidas = horas * 60;
        float totalMinutos = horasConvertidas + minutos;

        System.out.println("\nA hora digitada em minutos: " + horasConvertidas);
        System.out.println("O total de minutos: " + totalMinutos);
        System.out.println("O total de minutos convertidos em segundos: " + totalMinutos * 60);
    }

    public void question5(){
        System.out.println("Em metros.");
        System.out.print("Informe a largura do cômodo [m]: ");
        float largura = this.scanner.nextFloat();

        System.out.print("Informe o comprimento do cômodo [m]: ");
        float comprimento = this.scanner.nextFloat();

        float area = comprimento* largura;

        System.out.println("\nValor da área: " + area);
        System.out.println("Para iluminar, deve-se usar " + area * 18 + "w");
    }
}
