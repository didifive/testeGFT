package Teste01.modelo;

public class Vendedor extends Colaborador{
    public Vendedor() {
    }

    public Vendedor(String nome, int idade, double salario, int grauInstrucao) {
        super(nome, idade, salario, grauInstrucao);
    }

    @Override
    public double bonificacao() {
        return getSalario() + 300.00 * getGrauInstrucao() * 4;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "Nome = '" + getNome() + "'" +
                ", Idade = " + getIdade() +
                ", Salário = " + String.format("%.2f",getSalario()) +
                ", Grau de Instrução = " + getGrauInstrucao() +
                ", Bonificação = " + String.format("%.2f",bonificacao()) +
                "}";
    }
}
