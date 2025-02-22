package Empresa;
public class Funcionario extends Pessoa{

    String salario;
    String cargo;

    public Funcionario(String nome, String idade, String salario, String cargo) {
        super(nome, idade);
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario [salario=" + salario + ", nome=" + nome + ", cargo=" + cargo + ", idade=" + idade + "]";
    }


}
