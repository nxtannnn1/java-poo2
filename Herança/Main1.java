package Herança;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            String marca;
            String modelo;
            String armazenamento;
            String frequencia;
            String option;
            String repetir = "s";

            ArrayList<Memoria> minhasMemorias = new ArrayList<>();
            ArrayList<Processador> meusProcessadores = new ArrayList<>();

            while (repetir.equals("s")) {

                System.out.println("(1)-Memoria\n(2)-Processador");
                option = input.nextLine();

                if (option.equals("1")) {

                    while (repetir.equals("s")) {

                        System.out.print("\nCadastrar marca da memoria: ");
                        marca = input.nextLine();

                        System.out.print("Cadastrar modelo da memoria: ");
                        modelo = input.nextLine();

                        System.out.print("Cadastrar armazenamento da memoria: ");
                        armazenamento = input.nextLine();

                        System.out.print("Cadastrar frequencia da memoria: ");
                        frequencia = input.nextLine();

                        Memoria memoria = new Memoria(marca, modelo, armazenamento, frequencia);

                        minhasMemorias.add(memoria);

                        System.out.print("\nContinuar cadastro de memórias: ");
                        repetir = input.nextLine().toLowerCase();
                    }

                }

                if (option.equals("2")) {

                    while (repetir.equals("s")) {

                        System.out.print("\nCadastrar marca do processador: ");
                        marca = input.nextLine();

                        System.out.print("Cadastrar modelo do processador: ");
                        modelo = input.nextLine();

                        System.out.print("Cadastrar frequencia do processador: ");
                        frequencia = input.nextLine();

                        Processador processador = new Processador(marca, modelo, frequencia);

                        meusProcessadores.add(processador);

                        System.out.print("\nContinuar cadastro de processadores: ");
                        repetir = input.nextLine().toLowerCase();

                    }

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

            input.close();

        }

    }

}
