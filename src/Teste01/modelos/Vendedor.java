package Teste01.modelos;

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
                "nome='" + getNome() +
                ", idade=" + getIdade() +
                ", salario=" + getSalario() +
                ", grauInstrucao=" + getGrauInstrucao() +
                ", bonificacao=" + bonificacao() +
                "}";
    }
}
