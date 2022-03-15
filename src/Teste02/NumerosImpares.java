package Teste02;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digito, numero, numerosImpares=0;
        boolean continua = true;
        do {
            System.out.println("Digite um número inteiro para verificar quais dígitos são ímpares:");
            numero = input.nextInt();
            if (numero < 100) {
                System.out.println("Para funcionar deve-se informar no mínimo 3 dígitos.");
                continue;
            }
            if (numero < 350 || numero > 8750){
                System.out.println("Digite um número inteiro válido entre 350 e 8750.");
                continue;
            }
            while(numero > 0){
                digito = numero % 10;
                numero /= 10;
                if (digito%2 !=0) numerosImpares ++;
            }
            if (numerosImpares == 0) {
                System.out.println("O número não possuí dígito ímpar.");
            } else {
                System.out.printf("Existem %d dígito(s) ímpar(es).\n", numerosImpares);
            }
            continua = false;
        }while(continua);
        input.close();
    }
}
