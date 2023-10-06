package ConverteExtenso;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        char desejaContinuar = 's';
        boolean condicao;

        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            System.out.println("Digite um número de 1 a 5: ");
            num = scan.nextInt();

            switch (num) {
                case 1 ->
                    System.out.println("Número UM. ");
                case 2 ->
                    System.out.println("Número DOIS. ");
                case 3 ->
                    System.out.println("Número TRÊS. ");
                case 4 ->
                    System.out.println("Número QUATRO. ");
                case 5 ->
                    System.out.println("Número CINCO. ");
                default ->
                    System.out.println("NÚMERO INVÁLIDO! ");
            }

            do{
                System.out.println("Deseja continuar? 'S'-SIM ou 'N'-NÂO. ");
                desejaContinuar = scan.next().charAt(0);

                switch (desejaContinuar) {
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
