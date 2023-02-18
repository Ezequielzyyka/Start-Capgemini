
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
            
            System.out.println("Digite um número");
            int numero = scan.nextInt();
            
            if(numero == 0){
                System.out.println("O número é zero ");
            } else {
                if(numero > 0){
                    System.out.println("O número é maior que zero ");
                } else {
                    System.out.println("O número é menor que zero ");
                }
            }
            
            int condicao = 0;
            do{
                System.out.println("Deseja continuar? S - Sim / N - Não ");
                desejaContinuar = scan.next().charAt(0);

                if (desejaContinuar != 's' && desejaContinuar != 'S' 
                        && desejaContinuar != 'n' && desejaContinuar != 'N') {
                        System.out.println("Opção invalida ");
                        condicao = 1;
                } else {
                    condicao = 0;
                }
            } while (condicao != 0);
        }
    }
    
}
