
package MostradorMaiorIdade;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] idade = new int [15];
        String[] nome = new String[15];
        
        for(int i = 0; i < 15; i++){
            System.out.println("Informe o nome: ");
            nome[i] = scan.nextLine();
            
            System.out.println("Informe a idade: ");
            idade[i] = scan.nextInt();
            scan.nextLine();
        }
        
        for(int i = 0; i < 15; i++){
            if(idade[i] >= 18){
                System.out.println(nome[i] + " 'MAIOR DE IDADE'.");
            } else {
                System.out.println(nome[i] + " 'MENOR DE IDADE'.");
            }
        }
    }
    
}
