package Herança;

import java.util.Scanner;

public class Processador extends Componente {

    private String frequencia;

    public Processador() {

    }

    public Processador(String frequencia) {
        this.frequencia = frequencia;
    }

    public Processador(String marca, String modelo, String frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public void exibirDescricao() {
        System.out.println("\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nFrequencia: " + getFrequencia());
    }

    @Override

    public void cadastrarComponentes(Scanner input) {

        System.out.print("\nCadastrar marca do processador: ");
        String my_brand = input.nextLine();

        System.out.print("Cadastrar modelo do processador: ");
        String my_model = input.nextLine();

        System.out.print("Cadastrar frequencia do processador: ");
        String my_frequency = input.nextLine();

        setMarca(my_brand);
        setModelo(my_model);
        setFrequencia(my_frequency);

    }

}
