package Comparador;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.println("Digite um número. ");
            num = scan.nextInt();

            if (num > 80) {
                System.out.println("Número maior que 80.");

            } else if (num < 25) {
                System.out.println("Número menor que 25.");

            } else if (num == 40) {
                System.out.println("Número igual a 40.");
            }

            boolean condicao;
            do {
                System.out.println("Deseja continuar? 'S'-SIM ou 'N'-FINALIZAR.");
                continuar = scan.next().charAt(0);

                switch (continuar) {
                    case 's', 'S', 'n', 'N' ->
                        condicao = true;
                    default -> {
                        System.out.println("Opção inválida! ");
                        condicao = false;
                    }
                }
            } while (!condicao);
        }
    }

}
