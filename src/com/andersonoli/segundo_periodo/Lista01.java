package com.andersonoli.segundo_periodo;

import java.util.Scanner;

public class Lista01 {
    public Scanner leitor;

    public Lista01(){
        this.leitor = new Scanner(System.in);
    }

    public void question01(){
        System.out.print("Valor a ser pago: ");
        double valor = this.leitor.nextDouble();

        System.out.print("Preço do produto: ");
        double preco = this.leitor.nextDouble();

        System.out.println("O seu troco é: " + (preco - valor));
    }

    public void question02(){
        System.out.print("Valor de A: ");
        double a = leitor.nextFloat();

        System.out.print("Valor de B: ");
        double b = leitor.nextFloat();

        System.out.print("Valor de C: ");
        double c = leitor.nextFloat();

        double delta = (Math.pow(b, 2)) - (4 * a * c);

        System.out.println("\nDelta: " + delta);

        if(delta < 0){
            System.out.println("\nA equação não possui raízes reais.");
            return;
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
    }

    public void question03(){
        double excesso = 0;
        double multa = 0;

        System.out.print("Insira o peso do peixes [Kg]: ");
        double peso = this.leitor.nextDouble();

        if(peso > 50){
            excesso =  peso - 50;
            multa = excesso * 4;
        }

        System.out.println("O peso excedente é: " + excesso);
        System.out.println("O valor da multa a ser pago é: " + multa);
    }

    public void question04(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor de N: ");
        int valorN = leitor.nextInt();
        //System.out.println("O valor de S é: " + calculo(valorN));
        System.out.println("O valor de S é: " + calculoR(valorN));
    }

    // função auxiliar da questão 04
    public float calculo(int n){
        float resultado = 0;

        for (int i = 0; i <= n; i++) {
            resultado += 1.0 / fatorial(i);
        }
        return resultado;
    }

    // versão da função 'calculo' com recursividade
    public double calculoR(int num){
        if(num == 0) return 1;
        return calculoR(num - 1) + 1.0 / fatorial(num);
    }

    // calculo fatorial de n
    public int fatorial(int n){
        if(n == 0) return 1;
        return  n * fatorial(n - 1);
    }

    public void question05(){
        // quantidade de quadrados perfeitos
        int quantidadeQuadrados = 0, j;

        do {
            System.out.print("Insira um número: ");
            j = this.leitor.nextInt();
            if(j >= -10_000 && j <= 10_000 && j != 0){
                double resul = Math.sqrt(j);
                if((int) resul == resul) quantidadeQuadrados++;
            }
        } while(j != 0);

        System.out.println(quantidadeQuadrados);
    }

    public void question06(){
        while(true){
            System.out.print("Informe um número: ");
            int numero = this.leitor.nextInt();

            if(numero < 10){
                System.out.println("O fatorial do número " + numero + " é: " + fatorial(numero));
            } else {
                System.out.println("O número " + numero + " tem " + numDivisores(numero) + " divisores.");
            }
        }
    }

    // função auxiliar para a questão 06
    // retorna quantos divisores tem um número inteiro positivo
    public int numDivisores(int num){
        int quantidadeDivisores = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) quantidadeDivisores++;
        }
        return quantidadeDivisores;
    }
}
