
package PostoCombustivelPOO;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        BombaCombustivel combustivel = new BombaCombustivel();
        BombaCombustivel alcool = new BombaCombustivel();
        BombaCombustivel gasolina = new BombaCombustivel();
        BombaCombustivel diesel = new BombaCombustivel();

        char desejaContinuar = 's';

        boolean verificador;

        while (desejaContinuar == 's' || desejaContinuar == 'S') {

            combustivel.mostrarMenu();

            switch (combustivel.getMenu()) {
                case 'a','A','b','B','c','C','d','D' -> {

                    combustivel.alterarCombustivel();

                    if ("Álcool".equals(combustivel.getTipoCombustivel())) {
                        alcool.setTipoCombustivel("Álcool");
                        alcool.setMenu(combustivel.getMenu());
                        alcool.escolherMenu();

                    } else if ("Gasolina".equals(combustivel.getTipoCombustivel())) {
                        gasolina.setTipoCombustivel("Gasolina");
                        gasolina.setMenu(combustivel.getMenu());
                        gasolina.escolherMenu();

                    } else if ("Diesel".equals(combustivel.getTipoCombustivel())) {
                        diesel.setTipoCombustivel("Diesel");
                        diesel.setMenu(combustivel.getMenu());
                        diesel.escolherMenu();
                    }
                }

                default ->
                    System.out.println("Opção inválida! ");
            }

            do {
                System.out.println("Deseja fazer mais algúm abastecimento? 'S'-SIM ou 'N'-FINALIZAR. ");
                desejaContinuar = scan.next().charAt(0);

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
