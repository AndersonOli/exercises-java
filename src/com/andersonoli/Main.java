package com.andersonoli;

import com.andersonoli.aulas.Aula02;
import com.andersonoli.aulas.Aula03;
import com.andersonoli.aulas.Aula04;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
     * Author: Anderson Oliveira
     * Date: 15/08/2020
     */

    public Scanner scanner;

    public Main(){
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Aula02 aula02 = new Aula02();
        Aula03 aula03 = new Aula03();
        Aula04 aula04 = new Aula04();

        aula04.question2();
    }
}
