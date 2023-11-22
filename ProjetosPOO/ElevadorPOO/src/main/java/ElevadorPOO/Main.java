
package ElevadorPOO;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Elevador elevador = new Elevador();
        
        int capacidadeElevador, qtdAndaresPredio;
        char desejaContinuar = 's';
        boolean verificador;
        
        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            System.out.println("Informe a capacidade de pessoas que o elevador suporta. ");
            capacidadeElevador = scan.nextInt();
            
            System.out.println("Informe a quantidade de andares existentes no predio sem contar o térreo. ");
            qtdAndaresPredio = scan.nextInt();
            
            elevador.inicializar(capacidadeElevador, qtdAndaresPredio);
            
            
            
            do {
                System.out.println("Deseja utilizar o elevador novamente? Tecle 'S'-SIM ou 'N'-FINALIZAR. ");
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
