package Teste03;

import Teste03.modelos.Conta;
import Teste03.modelos.ContaCorrente;
import Teste03.modelos.ContaPoupanca;

public class PrincipalConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(23587,"Mariana Alencar", 1500.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(123456, "Elisa Soares", 2000.00);

        System.out.println(contaCorrente);
        System.out.printf("%s\n","-".repeat(100));
        System.out.println(contaPoupanca);
    }
}
