package Empresa;
import java.util.Scanner;

public class Funcionario {

    private String nome;
    private SEXO sexo;

    public Funcionario(String nome, SEXO sexo){
        this.nome=nome;
        this.sexo=sexo;
    }

    public Funcionario (){

    }

    public String getNome(){
        return this.nome;
    }

    public SEXO getSexo(){
        return this.sexo;
    }

    public String setNome (Scanner sc){
        System.out.println("Informar nome: ");
        this.nome = sc.nextLine();
        return this.nome;
    }

    public SEXO setSexo (Scanner sc){
        System.out.println("Informar sexo (MASC, FEMI, OUTRO)");
        String sexoEscolhido = sc.nextLine().toUpperCase();
            
        try{
            this.sexo=SEXO.valueOf(sexoEscolhido);
        }

        catch (IllegalArgumentException e){
System.out.println("Sexo inválido");
        }
    
        return this.sexo;
    }
}
