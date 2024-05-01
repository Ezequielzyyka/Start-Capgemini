
package AprovacaoDiscipinaPOO;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
                
        char continuar = 's';
        boolean verificador;
        
        while (continuar == 's' || continuar == 'S'){
            aluno.informarDados();
            aluno.mostrarDados();
            
            do{
                System.out.println("Deseja fazer outra operação? Digite 'S'- SIM ou 'N'- NÃO: ");
                continuar = scan.next().charAt(0);
                
                switch (continuar) {
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
