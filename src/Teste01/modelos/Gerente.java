package Teste01.modelos;

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
        return "Gerente{" +
                "nome='" + getNome() +
                ", idade=" + getIdade() +
                ", salario=" + getSalario() +
                ", grauInstrucao=" + getGrauInstrucao() +
                ", bonificacao=" + bonificacao() +
                "}";
    }
}
