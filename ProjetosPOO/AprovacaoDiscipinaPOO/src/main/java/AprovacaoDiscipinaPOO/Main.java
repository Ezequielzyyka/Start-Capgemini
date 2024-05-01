
package AprovacaoDiscipinaPOO;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Aluno aluno1 = new Aluno();
        
        aluno1.informarDados();
        aluno1.mostrarDados();
    }
    
}
