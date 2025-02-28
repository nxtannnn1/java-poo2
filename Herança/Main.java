package Herança;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            String option;
            String repetir = "s";

            ArrayList<Memoria> minhasMemorias = new ArrayList<>();
            ArrayList<Processador> meusProcessadores = new ArrayList<>();

            while (repetir.equals("s")) {

                System.out.println("(1)-Memoria\n(2)-Processador");
                option = input.nextLine();

                if (option.equals("1")) {
                    Memoria memoria = new Memoria();
                    memoria.cadastrarComponentes(input);
                    minhasMemorias.add(memoria);

                }

                if (option.equals("2")) {

                    Processador processador = new Processador();
                    processador.cadastrarComponentes(input);
                    meusProcessadores.add(processador);

                }

                System.out.print("\nContinuar cadastro de produtos: ");
                repetir = input.nextLine().toLowerCase();

            }

            System.out.println("\nMemórias cadastradas:");
            for (Memoria m : minhasMemorias) {
                m.exibirDescricao();
            }

            System.out.println("\nProcessadores cadastrados:");
            for (Processador p : meusProcessadores) {
                p.exibirDescricao();
            }

        }

    }

}
