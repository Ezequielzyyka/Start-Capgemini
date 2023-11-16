
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
                    
                    if ("Álcool".equals(combustivel.getTipoCombustivel())) {
                        alcool.setTipoCombustivel("Álcool");
                        
                        switch (menu) {
                            case 'a', 'A' -> alcool.abastecerPorValor();
                            case 'b', 'B' -> alcool.abasterPorLitro();
                            case 'c', 'C' -> alcool.alterarQuantidadeCombustivel();
                            default ->       alcool.alterarValor();
                        }

                    } else if ("Gasolina".equals(combustivel.getTipoCombustivel())) {
                        gasolina.setTipoCombustivel("Gasolina");
                        
                        switch (menu) {
                            case 'a', 'A' -> gasolina.abastecerPorValor();
                            case 'b', 'B' -> gasolina.abasterPorLitro();
                            case 'c', 'C' -> gasolina.alterarQuantidadeCombustivel();
                            default ->       gasolina.alterarValor();
                        }

                    } else if ("Diesel".equals(combustivel.getTipoCombustivel())) {
                        diesel.setTipoCombustivel("Diesel");
                        
                        switch (menu) {
                            case 'a', 'A' -> diesel.abastecerPorValor();
                            case 'b', 'B' -> diesel.abasterPorLitro();
                            case 'c', 'C' -> diesel.alterarQuantidadeCombustivel();
                            default ->       diesel.alterarValor();
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
