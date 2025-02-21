package Empresa;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Funcionario funcionario1 = new Funcionario ();
        
        funcionario1.setNome(input);
        funcionario1.setSexo(input);

        System.out.println("Nome: "+funcionario1.getNome()+"\nSexo: "+funcionario1.getSexo());
    }

}
