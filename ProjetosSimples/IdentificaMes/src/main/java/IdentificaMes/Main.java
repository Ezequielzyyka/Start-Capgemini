package IdentificaMes;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String num;
        int numero;
        char desejaContinuar = 's';
        boolean verificador;

        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            
            do {
                System.out.println("Informe um número refernte aos meses do ano. ");
                num = scan.next();
                
                switch (num){
                    case "1","2","3","4","5","6","7","8","9","10","11","12" -> verificador = true;
                    default -> { 
                        System.out.println("Opção inválida! ");
                        verificador = false;
                    }
                }
                
            } while (!verificador);
            
            numero = Integer.parseInt(num);

            switch (numero) {
                case 1 -> System.out.println("Janeiro ");
                case 2 -> System.out.println("Fevereiro ");
                case 3 -> System.out.println("Março ");
                case 4 -> System.out.println("Abríl ");
                case 5 -> System.out.println("Máio ");
                case 6 -> System.out.println("Junho ");
                case 7 -> System.out.println("Julho ");
                case 8 -> System.out.println("Agosto ");
                case 9 -> System.out.println("Setembro ");
                case 10 -> System.out.println("Outubro ");
                case 11 -> System.out.println("Novembro ");
                case 12 -> System.out.println("Dezembro ");
                default -> System.out.println("Opção inválida! ");
            }

            do {
                System.out.println("Deseja continuar? 'S'-Continuar ou 'N'-Finalizar. ");
                desejaContinuar = scan.next().charAt(0);
                
                switch (desejaContinuar){
                    case 's','S','n','N' -> verificador = true;
                    default -> { 
                        System.out.println("Opção inválida! ");
                        verificador = false;
                    }
                }
                
            } while (!verificador);
        }
    }

}
