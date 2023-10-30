
package ConvesorMoeda;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        float real, dolar, valorDolar;
        
        System.out.println("Informe o valor em dólar a ser convertido. ");
        dolar = scan.nextFloat();
        
        System.out.println("Informe a cotação do dólar vigente no momento.");
        valorDolar = scan.nextFloat();
        
        real = dolar * valorDolar;
        
        System.out.println("\nCONVERSÃO:");
        System.out.println("US$ " + dolar + " = " + "R$ " + real);
    }
    
}
