package Teste03.modelo;

public class ContaPoupanca extends Conta{
    public ContaPoupanca() {
    }

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento() {
        return getSaldo() * 0.07;
    }

    @Override
    public String toString() {
        return "Conta Poupança {" +
                "Número = " + getNumero() +
                ", Titular = '" + getTitular() + "'" +
                ", Saldo = " + String.format("%.2f",getSaldo()) +
                ", Rendimento mensal = " + String.format("%.2f",rendimento()) +
                "}";
    }
}
