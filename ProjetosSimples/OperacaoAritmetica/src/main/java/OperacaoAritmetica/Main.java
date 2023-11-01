
package OperacaoAritmetica;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        float valorA = 0.0f;
        float valorB = 0.0f;
        char operacaoC;
        char desejaContinuar = 's';
        boolean verificador;
        
        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            System.out.println("Informe o primeiro valor de A. ");
            valorA = scan.nextFloat();
            
            do {
                System.out.println("Informe a operação aritmética desejada: '+', '-', '*' ou '/'. ");
                operacaoC = scan.next().charAt(0);
                
                switch (operacaoC){
                    case '+','-','*','/' -> verificador = true;
                    default -> { 
                        System.out.println("Operador não definido! ");
                        verificador = false;
                    }
                }
                
            } while (!verificador);
            
            System.out.println("Informe o segundo valor de B. ");
            valorB = scan.nextFloat();
            
            switch (operacaoC){
                case '+' -> System.out.println("A+B\n" + valorA + " + " + valorB + " = " + (valorA + valorB));
                case '-' -> System.out.println("A-B\n" + valorA + " - " + valorB + " = " + (valorA - valorB));
                case '*' -> System.out.println("A*B\n" + valorA + " * " + valorB + " = " + (valorA * valorB));
                case '/' -> {
                    if (valorB == 0){
                        System.out.println("Não existe divisão por '0'! ");
                    } else {
                        System.out.println("A/B\n" + valorA + " / " + valorB + " = " + (valorA / valorB));
                    }
                }
            }
            
            do {
                System.out.println("Deseja fazer outra operação? 'S'-CONTINUAR ou 'N'-FINALIZAR. ");
                desejaContinuar = scan.next().charAt(0);
                
                switch (desejaContinuar) {
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
