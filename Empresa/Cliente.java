package Empresa;

public class Cliente extends Pessoa {

    protected String dataCompra;
    protected String formaPagamento;

    public Cliente(String nome, String idade, String dataCompra, String formaPagamento) {
        super (nome,idade);
        this.dataCompra = dataCompra;
        this.formaPagamento = formaPagamento;
    }

    



}
