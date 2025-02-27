package Herança;

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

}
