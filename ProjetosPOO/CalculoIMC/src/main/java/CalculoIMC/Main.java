
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
        pessoa.setAltura (scan.nextFloat());
        
        System.out.println("Informe o peso. ");
        pessoa.setPeso (scan.nextFloat());
        
        System.out.println("IMC = " + pessoa.calcularIMC());
    }
    
}
