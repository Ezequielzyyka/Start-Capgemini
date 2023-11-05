
package PessoaPOO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Pessoa pessoa = new Pessoa();

        char desejaContinuar = 's';
        boolean verificador;

        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            System.out.println("Informe o nome. ");
            pessoa.setNome(scan.nextLine());

            do {
                System.out.println("Informe a data de nascimento. 'dd/MM/AAAA' ");
                String nascimento = scan.nextLine();
                try {
                    pessoa.setDataNascimento(sdf.parse(nascimento));
                    verificador = true;
                } catch (ParseException e) {
                    System.out.println("Data informada no formato errado! \nInforme a data separada por barras. ");
                    verificador = false;
                }
            } while (!verificador);

            System.out.println("informe a altura. ");
            pessoa.setAltura(scan.nextFloat());

            pessoa.imprimirDados();

            do {
                System.out.println("Deseja continuar? 'S'-SIM ou 'N'-FINALIZAR. ");
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
