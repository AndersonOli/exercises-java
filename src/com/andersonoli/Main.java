package com.andersonoli;

import com.andersonoli.aulas.Aula02;
import com.andersonoli.aulas.Aula03;
import com.andersonoli.aulas.Aula04;
import com.andersonoli.aulas.Aula05;
import com.andersonoli.segundo_periodo.Lista01;
import com.andersonoli.segundo_periodo.Lista02;

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
        //primeiro bimestre
        Aula02 aula02 = new Aula02();
        Aula03 aula03 = new Aula03();
        Aula04 aula04 = new Aula04();
        Aula05 aula05 = new Aula05();

//        aula05.question01();

        // segundo bimestre
        Lista01 lista01 = new Lista01();
        Lista02 lista02 = new Lista02();

//        lista01.question01();

        lista02.question15();
    }
}
