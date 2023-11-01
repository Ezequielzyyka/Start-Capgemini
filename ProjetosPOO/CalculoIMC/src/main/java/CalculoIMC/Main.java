
package CalculoIMC;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Informe a altura. ");
        pessoa.altura = scan.nextFloat();
        
        System.out.println("Informe o peso. ");
        pessoa.peso = scan.nextFloat();
        
        System.out.println("IMC = " + pessoa.calcularIMC());
    }
    
}
