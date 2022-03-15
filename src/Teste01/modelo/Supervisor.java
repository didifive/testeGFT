package Teste01.modelo;

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
                "Nome = '" + getNome() + "'" +
                ", Idade = " + getIdade() +
                ", Salário = " + String.format("%.2f",getSalario()) +
                ", Grau de Instrução = " + getGrauInstrucao() +
                ", Bonificação = " + String.format("%.2f",bonificacao()) +
                "}";
    }
}
