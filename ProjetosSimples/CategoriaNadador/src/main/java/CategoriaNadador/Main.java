package CategoriaNadador;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String entradaIdade;
        int idade;
        char desejaContinuar = 's';
        boolean verificador;
        boolean isNumeric;

        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            System.out.println("Informe a idade do nadador. ");
            entradaIdade = scan.nextLine();
            isNumeric = (entradaIdade != null && entradaIdade.matches("[0-9]+"));

            if (isNumeric) {
                idade = Integer.parseInt(entradaIdade);

                if (idade >= 5 && idade <= 7) {
                    System.out.println("Categoria 'Infantil A'. ");
                } else if (idade >= 8 && idade <= 10) {
                    System.out.println("Categoria 'Infantil B'. ");
                } else if (idade >= 11 && idade <= 13) {
                    System.out.println("Categoria 'Juvenil A'. ");
                } else if (idade >= 14 && idade <= 17) {
                    System.out.println("Categoria 'Juvenil B'. ");
                } else if (idade >= 18 && idade <= 25) {
                    System.out.println("Categoria 'Sênior'. ");
                } else {
                    System.out.println("Idade fora da faixa etária. ");
                }

            } else {
                System.out.println("Não é um numero válido! ");
            }

            do {
                System.out.println("Deseja pesquisar outra categoria? 'S'-Continuar ou 'N'-Finalizar. ");
                desejaContinuar = scan.next().charAt(0);
                scan.nextLine();

                switch (desejaContinuar) {
                    case 's','S','n','N' ->
                        verificador = true;
                    default -> {
                        System.out.println("Opção inválida! ");
                        verificador = false;
                    }
                }
            } while (!verificador);
        }
    }

}
