package Teste01.modelo;

public class Gerente extends Colaborador{
    public Gerente() {
    }

    public Gerente(String nome, int idade, double salario, int grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }

    @Override
    public double bonificacao() {
        return getSalario() + 1000.00 * getGrauInstrucao() * 2;
    }

    @Override
    public String toString() {
        return "Gerente {" +
                "Nome = '" + getNome() + "'" +
                ", Idade = " + getIdade() +
                ", Salário = " + String.format("%.2f",getSalario()) +
                ", Grau de Instrução = " + getGrauInstrucao() +
                ", Bonificação = " + String.format("%.2f",bonificacao()) +
                "}";
    }
}
