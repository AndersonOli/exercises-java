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
            System.out.println("O aluno necessita tirar: " + (12-media));
        } else {
            System.out.println("O aluno em questão está aprovado.\nSua média é: " + media);
        }
    }

    public void question3(){

    }
}
