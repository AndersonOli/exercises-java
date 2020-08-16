package com.andersonoli;

import com.andersonoli.aulas.Aula02;
import com.andersonoli.aulas.Aula03;

import java.util.Scanner;

public class Main {
    /*
     * Author: Anderson Oliveira
     * Date: 15/08/2020
     */

    protected Scanner scanner;

    public Main(){
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Aula02 example01 = new Aula02();
        Aula03 example02 = new Aula03();

        example02.question5();
    }
}
