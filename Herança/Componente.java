package Herança;

import java.util.Scanner;

public abstract class Componente {

    protected String marca;
    protected String modelo;

    public Componente() {
    }

    public Componente(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void exibirDescricao();

    public abstract void cadastrarComponentes(Scanner input);

}
