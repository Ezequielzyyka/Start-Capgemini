package CalculoJurosMensal;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Float valorDepositado, total, totalJuros;
        Float taxaJuros = 0.07f;
                
        System.out.println("Informe o valor depositado. ");
        valorDepositado = scan.nextFloat();
        
        totalJuros = (taxaJuros * valorDepositado)/ 100;
        
        System.out.println("Valor atualizado com rendimentos em um mês: \nR$ " 
                + (totalJuros + valorDepositado) + "\nRendimentos: R$ " + totalJuros);
    }
    
}
