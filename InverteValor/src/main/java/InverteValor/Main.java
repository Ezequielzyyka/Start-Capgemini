package InverteValor;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

       public static void main(String[] args) {
           
           Scanner scan = new Scanner(System.in);
           
           float a = 0.0f;
           float b = 0.0f;
           float c = 0.0f;
           
           System.out.println("Informe o valor de 'A'.");
           a = scan.nextFloat();
           
           System.out.println("Informe o valor de 'B'.");
           b = scan.nextFloat();
           
           System.out.println("\nA = " + a + "\nB = " + b);
           
           c = a;
           a = b;
           b = c;
           
           System.out.println("Os valores trocados sao: \n" + "A = " + a + "\nB = " + b);
    }
    
}
