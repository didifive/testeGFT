package Teste01;

import Teste01.modelo.Gerente;
import Teste01.modelo.Supervisor;
import Teste01.modelo.Vendedor;

/**
 * Teste 1
 * <p>
 * Criar classes, instanciar objetos e imprimir
 *
 * @author Luis Carlos Zancanela
 */
public class PrincipalColaborador {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Tobias José", 45, 10000.00,5);
        Supervisor supervisor = new Supervisor("João Carlos", 35, 5000.00,3);
        Vendedor vendedor = new Vendedor("José Manuel", 25, 1000.00,2);

        System.out.println("Lista de Colaboradores:");
        System.out.printf("%s\n","-".repeat(100));
        System.out.println(gerente);
        System.out.printf("%s\n","-".repeat(100));
        System.out.println(supervisor);
        System.out.printf("%s\n","-".repeat(100));
        System.out.println(vendedor);
    }
}
