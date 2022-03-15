package Teste03;

import Teste03.modelo.ContaCorrente;
import Teste03.modelo.ContaPoupanca;

/**
 * Teste 3
 * <p>
 * Criar classes, instanciar objetos e imprimir
 *
 * @author Luis Carlos Zancanela
 */
public class PrincipalConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(23587,"Mariana Alencar", 1500.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(123456, "Elisa Soares", 2000.00);

        System.out.println("Lista de Contas:");
        System.out.printf("%s\n","-".repeat(100));
        System.out.println(contaCorrente);
        System.out.printf("%s\n","-".repeat(100));
        System.out.println(contaPoupanca);
    }
}
