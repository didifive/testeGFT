package Teste04;

import Teste04.modelo.Pessoa;

import java.util.Scanner;

/**
 * Teste 4
 * <p>
 * Calcula IMC e mostra a categoria conforme tabela
 *
 * @author Luis Carlos Zancanela
 */
public class CalculaIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, categoria;
        double altura,peso, iMC;

        System.out.print("Digite o NOME da pessoa: ");
        nome = input.next();
        System.out.print("Digite a ALTURA (em metros): ");
        altura = input.nextDouble();
        System.out.print("Digite o PESO (em Kg): ");
        peso = input.nextDouble();

        Pessoa pessoa = new Pessoa(nome,altura,peso);
        iMC = pessoa.calculaIMC();
        if (iMC < 18.5) {
            categoria = "Abaixo do peso";
        } else if (iMC >= 18.5 && iMC < 25) {
            categoria = "Peso Normal";
        } else if (iMC >= 25 && iMC < 30) {
            categoria = "Sobrepeso";
        } else if (iMC >= 30 && iMC < 35) {
            categoria = "Obesidade Grau I";
        } else if (iMC >= 35 && iMC < 40) {
            categoria = "Obesidade Grau II";
        } else {
            categoria = "Obesidade Grau III";
        }

        System.out.printf("%s\n","-".repeat(100));
        System.out.printf("A pessoa '%s' tem altura de %.2fm e peso de %.2fKg\n",pessoa.getNome(), pessoa.getAltura(), pessoa.getPeso());
        System.out.printf("O seu IMC é %.2f e está na categoria '%s'\n",iMC,categoria);

        input.close();
    }
}
