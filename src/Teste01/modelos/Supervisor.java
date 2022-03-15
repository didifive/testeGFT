package Teste01.modelos;

public class Supervisor extends Colaborador {
    public Supervisor() {
    }

    public Supervisor(String nome, int idade, double salario, int grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }

    @Override
    public double bonificacao() {
        return getSalario() + 500.00 * getGrauInstrucao() * 3;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "nome='" + getNome() +
                ", idade=" + getIdade() +
                ", salario=" + getSalario() +
                ", grauInstrucao=" + getGrauInstrucao() +
                ", bonificacao=" + bonificacao() +
                "}";
    }
}
