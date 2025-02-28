package Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            Adicao adicao = new Adicao();
            Subtracao subtracao = new Subtracao();
            Multiplicacao multiplicacao = new Multiplicacao();
            Divisao divisao = new Divisao();

            System.out.println("Informar a: ");
            double a = input.nextDouble();
            System.out.println("Informar b: ");
            double b = input.nextDouble();

            System.out.println("Resultado: " + adicao.calcular(a, b));
            System.out.println("Resultado: " + subtracao.calcular(a, b));
            System.out.println("Resultado: " + multiplicacao.calcular(a, b));
            System.out.println("Resultado: " + divisao.calcular(a, b));

            input.close();
        }
    }

}
