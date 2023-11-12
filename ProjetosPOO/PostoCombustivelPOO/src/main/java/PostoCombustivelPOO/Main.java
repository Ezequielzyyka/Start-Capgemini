
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
        char menu;
        boolean verificador;

        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            System.out.println("   Escolha uma opção.  ");
            System.out.println("'A'- Abastecer por valor. ");
            System.out.println("'B'- Abastecer por litros. ");
            System.out.println("'C'- Reabastecer reservatório da bomba. ");
            System.out.println("'D'- Alterar preço de combustível. ");
            menu = scan.next().charAt(0);

            switch (menu) {
                case 'a','A','b','B','c','C','d','D' -> {

                    combustivel.alterarCombustivel();

                    switch (menu) {

                        case 'a','A' -> {

                            if ("Álcool".equals(combustivel.getTipoCombustivel())) {
                                alcool.setTipoCombustivel("Álcool");
                                alcool.abastecerPorValor();

                            } else if ("Gasolina".equals(combustivel.getTipoCombustivel())) {
                                gasolina.setTipoCombustivel("Gasolina");
                                gasolina.abastecerPorValor();

                            } else {
                                if ("Diesel".equals(combustivel.getTipoCombustivel())) {
                                    diesel.setTipoCombustivel("Diesel");
                                    diesel.abastecerPorValor();
                                }
                            }
                        }
                        case 'b','B' -> {

                            if ("Álcool".equals(combustivel.getTipoCombustivel())) {
                                alcool.setTipoCombustivel("Álcool");
                                alcool.abasterPorLitro();

                            } else if ("Gasolina".equals(combustivel.getTipoCombustivel())) {
                                gasolina.setTipoCombustivel("Gasolina");
                                gasolina.abasterPorLitro();

                            } else {
                                if ("Diesel".equals(combustivel.getTipoCombustivel())) {
                                    diesel.setTipoCombustivel("Diesel");
                                    diesel.abasterPorLitro();
                                }
                            }

                        }
                        case 'c','C' -> {

                            if ("Álcool".equals(combustivel.getTipoCombustivel())) {
                                alcool.setTipoCombustivel("Álcool");
                                alcool.alterarQuantidadeCombustivel();

                            } else if ("Gasolina".equals(combustivel.getTipoCombustivel())) {
                                gasolina.setTipoCombustivel("Gasolina");
                                gasolina.alterarQuantidadeCombustivel();

                            } else {
                                if ("Diesel".equals(combustivel.getTipoCombustivel())) {
                                    diesel.setTipoCombustivel("Diesel");
                                    diesel.alterarQuantidadeCombustivel();
                                }
                            }

                        }
                        
                        case 'd','D' -> {
                            if ("Álcool".equals(combustivel.getTipoCombustivel())) {
                                alcool.setTipoCombustivel("Álcool");
                                alcool.alterarValor();

                            } else if ("Gasolina".equals(combustivel.getTipoCombustivel())) {
                                gasolina.setTipoCombustivel("Gasolina");
                                gasolina.alterarValor();

                            } else {
                                if ("Diesel".equals(combustivel.getTipoCombustivel())) {
                                    diesel.setTipoCombustivel("Diesel");
                                    diesel.alterarValor();
                                }
                            }
                            
                        }

                    }
                }
                default -> {
                    System.out.println("Opção inválida! ");
                }
            }

            do {
                System.out.println("Deseja fazer mais algúm abastecimento? 'S'-SIM ou 'N'-FINALIZAR. ");
                desejaContinuar = scan.next().charAt(0);

                switch (desejaContinuar) {
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
