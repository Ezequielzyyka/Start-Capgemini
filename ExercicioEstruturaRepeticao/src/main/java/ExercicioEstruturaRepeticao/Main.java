
package ExercicioEstruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        char desejaContinuar = 's';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            
            System.out.println("Digite um n�mero");
            int numero = scan.nextInt();
            
            if(numero == 0){
                System.out.println("O n�mero � zero ");
            } else {
                if(numero > 0){
                    System.out.println("O n�mero � maior que zero ");
                } else {
                    System.out.println("O n�mero � menor que zero ");
                }
            }
            
            int condicao = 0;
            do{
                System.out.println("Deseja continuar? S - Sim / N - N�o ");
                desejaContinuar = scan.next().charAt(0);

                if (desejaContinuar != 's' && desejaContinuar != 'S' 
                        && desejaContinuar != 'n' && desejaContinuar != 'N') {
                        System.out.println("Op��o invalida ");
                        condicao = 1;
                } else {
                    condicao = 0;
                }
            } while (condicao != 0);
        }
    }
    
}
