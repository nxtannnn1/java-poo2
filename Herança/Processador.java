package Herança;

public class Processador extends Componente {

    private String frequencia;

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

}
