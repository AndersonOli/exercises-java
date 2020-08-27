package com.andersonoli.segundo_periodo;

import java.util.Scanner;

public class Lista02 {
    public Scanner leitor;

    public Lista02(){
        this.leitor = new Scanner(System.in);
    }

    public void question01(){
        System.out.print("Informe o primeiro número: ");
        double primeiroValor = Double.parseDouble(this.leitor.next());

        System.out.print("Informe o segundo número: ");
        double segundoValor = Double.parseDouble(this.leitor.next());

        System.out.println(
                "\nAdição.........: " + (primeiroValor + segundoValor) + "\n" +
                "Subtração......: " + (primeiroValor - segundoValor) + "\n" +
                "Multiplicação..: " + (primeiroValor * segundoValor) + "\n" +
                "Divisão........: " + (primeiroValor / segundoValor) + "\n"
        );
    }

    public void question02(){
        System.out.print("Informe a distância total percorrida [Km]: ");
        double distancia = Double.parseDouble(this.leitor.next());

        System.out.print("Informe o total gasto em combustível [l]: ");
        double quantidadeConsumida = Double.parseDouble(this.leitor.next());

        double mediaConsumo = distancia / quantidadeConsumida;

        System.out.println("\nO automóvel em questão consome em média " + mediaConsumo + " por Km.");
    }

    public void question03(){
        System.out.print("Informe o nome do vendedor: ");
        String nomeVendedor = this.leitor.nextLine();

        System.out.print("Informe o valor do seu salário fixo [R$]: ");
        double salarioFixo = Double.parseDouble(this.leitor.next());

        System.out.print("Informe o total de vendas no mês [R$]: ");
        double totalVendas = Double.parseDouble(this.leitor.next());

        double comissao = totalVendas *  0.15;
        double salarioLiquido = salarioFixo + comissao;

        System.out.println("\nO vendedor " + nomeVendedor);
        System.out.println("Ganhos com comissão..: R$" + comissao);
        System.out.println("Seu salário fixo.....: R$" + salarioFixo);
        System.out.println("Seu salário líquido..: R$" + salarioLiquido);
    }

    public void question04(){
        System.out.print("Informe a tempratura [°C]: ");
        double temperaturaCelsius = Double.parseDouble(this.leitor.next());

        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

        System.out.println("A temperatura convertida é: " + temperaturaFahrenheit + "°F");
    }

    public void question05(){
        System.out.print("Informe a cotação do dollar [$]: ");
        double cotacao = Double.parseDouble(this.leitor.next());

        System.out.print("Informe o valor a ser convertido em dollares [$]: ");
        double valor = Double.parseDouble(this.leitor.next()); // valor em dollar a ser convetido

        double valorConvertido = valor / cotacao;

        System.out.println("\nAo converter você terá R$" + valorConvertido + " reais.");
    }

    public void question06(){
        System.out.print("Informe o valor a ser depositado na sua poupança [R$]: ");
        double valorDepositado = Double.parseDouble(this.leitor.next());

        double valorPoupanca = valorDepositado + (valorDepositado * 0.7);

        System.out.println("\nO valor após um mês na Poupança é de: R$" + valorPoupanca);
    }

    public void question07(){
        System.out.print("Informe o valor do produto [R$]: ");
        double valorProduto = Double.parseDouble(this.leitor.next());

        double valorPrestacao = valorProduto / 5;

        System.out.println("\nO valor de cada prestação será de: R$" + valorPrestacao + " reais");
    }

    public void question08(){
        System.out.print("Informe o preço de custo do produto [R$]: ");
        double precoCusto = Double.parseDouble(this.leitor.next());

        System.out.print("Informe a porcentagem de lucro [%]: ");
        double porcentagemLucro = Double.parseDouble(this.leitor.next()) / 100.0;

        double precoVenda = precoCusto + (precoCusto * porcentagemLucro);

        System.out.println("\nO preço de venda do produto é de R$" + precoVenda + " reais.");
    }

    public void question09(){
        // constantes de porcentagem
        final double PORCENTAGEM_DISTRIBUIDOR = 0.28;
        final double PORCENTAGEM_IMPOSTOS = 0.45;

        double precoCarro, valorFinal;

        System.out.print("Informe o custo de produção do carro [R$]: ");
        double precoFabrica = Double.parseDouble(this.leitor.next());

        double valorImpostos = precoFabrica * PORCENTAGEM_IMPOSTOS;

        precoCarro = precoFabrica + valorImpostos;
        valorFinal  = precoCarro + (precoCarro * PORCENTAGEM_DISTRIBUIDOR);

        System.out.println("\nO valor final do carro é de: R$" + valorFinal + " reais.");
    }

    public void question10(){
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("A: " + a + "\nB: " + b);
    }

    public void question11(){
        /*
        * A)
        *   120
        *   100 234
        * */

        /*
         * B)
         *   500
         *   140 500
         *   300 140 440
         * */

        /*
         * C)
         *   67 34 79
         * */

        /*
         * D)
         *   22
         *   100 234
         * */
    }

    public void question12(){
        /*
        * Os pares de instruções abaixo produzem o mesmo resultado?
        * 1. A ¬ (4/2)+(2/4) e A ¬ 4/2+2/4
        * 2. B ¬ 4/(2+2)/4 e B ¬ 4/2+2/4
        * 3. C ¬ (4+2)*2-4 e C ¬ 4+2*2-4
        * */

        // 1. Não
        // 2. Não
        // 3. Não
    }

    public void question13(){
        double a = 6 * (3 + 2);
        double b = 2 + 6  *  (3 + 2);
        double c = 2 + 3.0 * 6.0 / (2 + 4);
        double d = 2 * (8.0 / (3 + 1));
        double e = 3 + (16.0 - 2.0) / (2 * (9 - 2));
        double f = 6.0 / 3.0 + 8.0 / 2.0;
        double g = (3 + 8.0 / 2.0) * 4 + 3 * 2;
        double h = 6 * 3 * 3 + 6 - 10;
        double i = (10 * 8 + 3) * 9;
        double j = -12 * -4 + 3 * -4;
    }

    public void question14(){
        System.out.print("Informe um número: ");
        int numero = Integer.parseInt(this.leitor.next());
        System.out.println("\nSeu Antecessor é " + (numero - 1) + " e seu Sucessor é " + (numero + 1));
    }

    public void question15(){
        System.out.print("Informe a base do Retângulo [m]: ");
        double base = Double.parseDouble(this.leitor.next());

        System.out.print("Informe a altura do Retângulo [m]: ");
        double altura = Double.parseDouble(this.leitor.next());

        double areaRetangulo = base * altura;

        System.out.println("\nA área do Retangulo é de " + areaRetangulo + "m²");
    }
}
