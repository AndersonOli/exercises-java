package com.andersonoli.aulas;

import com.andersonoli.Main;

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
}
