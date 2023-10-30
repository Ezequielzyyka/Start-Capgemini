
package MostradorSexo;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        char sexo;
        String nome;
        int contadorMasc = 0;
        int contadorFemi = 0;
        
        for(int i = 0; i < 15; i++){
            System.out.println("Informe o nome: ");
            nome = scan.nextLine();
            
            System.out.println("informe o sexo: 'M' para masculino ou 'F' para feminino.");
            sexo = scan.next().charAt(0);
            scan.nextLine();
            
            if(sexo == 'm' || sexo == 'M'){
                System.out.println("Você é um 'HOMEM'. ");
                contadorMasc++;
                
            } else if(sexo == 'f' || sexo == 'F'){
                System.out.println("Você é uma 'MULHER'. ");
                contadorFemi++;
            }
        }
        
        System.out.println("No total, foram informado '" + contadorMasc + "' homens e '" 
                + contadorFemi + "' mulheres. ");
    }
    
}
