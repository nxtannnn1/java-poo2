package Herança;

import java.util.Scanner;

public class Memoria extends Componente {

    private String armazenamento;
    private String frequencia;

    public Memoria() {

    }

    public Memoria(String marca, String modelo, String armazenamento, String frequencia) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
        this.frequencia = frequencia;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public void exibirDescricao() {
        System.out.println("\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nArmazenamento: "
                + getArmazenamento() + "\nFrequencia: " + getFrequencia());
    }

    @Override

    public void cadastrarComponentes(Scanner input) {

        System.out.print("\nCadastrar marca da memoria: ");
        String marca = input.nextLine();

        System.out.print("Cadastrar modelo da memoria: ");
        String modelo = input.nextLine();

        System.out.print("Cadastrar armazenamento da memoria: ");
        String armazenamento = input.nextLine();

        System.out.print("Cadastrar frequencia da memoria: ");
        String frequencia = input.nextLine();

        setMarca(marca);
        setModelo(modelo);
        setArmazenamento(armazenamento);
        setFrequencia(frequencia);

    }

}
