package com.andersonoli.aula2;

import com.andersonoli.Main;

public class Aula02 extends Main {
    public void question1(){
        System.out.print("Insira seu o seu salário base: ");
        float salarioBase = this.scanner.nextFloat();

        float salarioReceber = (float) (salarioBase + (salarioBase * 0.05) - (salarioBase * 0.07));

        System.out.println("O seu salário a receber: " + salarioReceber);
    }

    public void question2(){
        float lucro, imposto, total;

        System.out.print("Insira o preço de fábrica do veículo...........: ");
        float precoProducao = this.scanner.nextFloat();

        System.out.print("Insira o percentual de lucro sob o veículo.....: ");
        float porcentagemLucro = this.scanner.nextFloat();
        lucro = (precoProducao * (porcentagemLucro/100));

        System.out.print("Insira o percentual de impostos sob o veículo..: ");
        float porcentagemImpostos = this.scanner.nextFloat();
        imposto = (precoProducao * (porcentagemImpostos/100));

        total = precoProducao + lucro + imposto;

        System.out.println("\nO lucro do distribuidor.............: R$" + lucro);
        System.out.println("O valor dos impostos sob o veículo..: R$" + imposto);
        System.out.println("O precço final do veículo é.........: R$" + total);
    }

    public void question3(){
        System.out.print("Informe o seu salário mínimo: ");
        float salarioMinimo = scanner.nextFloat();

        System.out.print("Informe a quantidade de quilowatts consumida: ");
        float quiloWats = scanner.nextFloat();


        float valorQuiloWatt = salarioMinimo / 5;
        float valorGasto = valorQuiloWatt * quiloWats;
        float valorDesconto = (float) (valorGasto - (valorGasto * 0.15));

        System.out.println("\nO valor de cada quiloWatt é......: R$" + valorQuiloWatt);
        System.out.println("O valor gasto pela residência é..: R$" + valorGasto);
        System.out.println("O valor com desconto de 15% é....: R$" + valorDesconto);
    }

    public void question4(){
        System.out.print("Informa a quantidade de dinheiro que você possui: ");
        float quantidadeDinheiro = scanner.nextFloat();

        float valorDollar = (float) (quantidadeDinheiro / 4.25);
        float valorEuro = (float) (quantidadeDinheiro / 4.75);
        float valorLibra = (float) (quantidadeDinheiro / 5.64);

        System.out.println("\nVocê pode comprar:\n\t$" + valorDollar + " dólares.");
        System.out.println("\t€" + valorEuro + " euros.");
        System.out.println("\t£" + valorLibra + " libras.");
    }
}
