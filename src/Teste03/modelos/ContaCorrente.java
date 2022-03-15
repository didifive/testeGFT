package Teste03.modelos;

public class ContaCorrente extends Conta{
    public ContaCorrente() {
    }

    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento() {
        return (getSaldo() * 0.05) - 0.75;
    }

    @Override
    public String toString() {
        return "Conta Corrente {" +
                "Número = " + getNumero() +
                ", Titular = '" + getTitular() + "'" +
                ", Saldo = " + getSaldo() +
                ", Rendimento mensal = " + rendimento() +
                "}";
    }
}
