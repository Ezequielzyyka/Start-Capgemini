package EstruturaWhile;

import java.util.Scanner;
/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {
        
        int totalAlunos = 5;
        
        Scanner scan = new Scanner(System.in);
        
        while(totalAlunos > 0){
            
            System.out.println("\nInforme o nome do aluno: ");
            String nomeAluno = scan.nextLine();           
            
            System.out.println("Informe a idade do alulo: ");
            int idadeAluno = Integer.parseInt(scan.nextLine());
            /*   pode ser feito assim:
            
            int idadeAluno = scan.nexInt();
            scan.nexLine();        -Apaga o buff de teclado.
            */
            
            System.out.println("O nome do aluno é: " + nomeAluno 
                    + " e sua idade é: " + idadeAluno + " anos");
            
            totalAlunos--;        
        }
    }
    
}
