
package Media;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        float nota1, nota2, nota3, media;
        String aluno, materia, status;
        
        System.out.println("Informe o nome do aluno. ");
        aluno = scan.nextLine();
        
        System.out.println("Informe a materia. ");
        materia = scan.nextLine();
        
        System.out.println("Informe a nota 1. ");
        nota1 = scan.nextFloat();
        
        System.out.println("Informe a nota 2. ");
        nota2 = scan.nextFloat();
        
        System.out.println("Informe a nota 3. ");
        nota3 = scan.nextFloat();
        
        media = (nota1 + nota2 + nota3)/ 3;
        
        if (media >= 7){
            status = "Aprovado";
        } else if (media <= 5){
            status = "Reprovado";
        } else {
            status = "Recuperação";
        }
        
        System.out.println("Aluno - " + aluno + "\nMatéria - " + materia + 
                "\nMédia - " + media + "\n" + status);
    }
    
}
