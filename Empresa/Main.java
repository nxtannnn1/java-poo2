package Empresa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informar nome do funcionário: ");
        String nome = input.nextLine();
        
        System.out.println("Informar idade: ");
        String idade = input.nextLine();
        
        System.out.println("Informar salario: ");
        String salario = input.nextLine();
        
        System.out.println("Informar cargo: ");
        String cargo = input.nextLine();

        Funcionario funcionario2 = new Funcionario(nome, idade, salario, cargo);
        System.out.println("Nome: " + funcionario2.getNome());
        // input.close;
    }

}
