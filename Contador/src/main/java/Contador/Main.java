
package Contador;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num;
        int contador = 0;
                
        for(int i = 0; i < 20; i++){
            
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            
            if(num >= 10 && num <=150){
                contador++;
            }
        }
        
        System.out.println("Dos números informados, '" + contador + 
                "' estão entre 10(inclusive) e 150(inclusive).");
    }
    
}
