
package IdentificaTriangulo;

import java.util.Scanner;
/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        float lado1, lado2, lado3;
        char desejaContinuar = 's';
        boolean verificador;
        
        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            System.out.println("Informe a medida do primeiro lado do triângulo. ");
            lado1 = scan.nextFloat();
            
            System.out.println("Informe a medida do segundo lado do triângulo. ");
            lado2 = scan.nextFloat();
            
            System.out.println("Informe a medida do terceiro lado do triângulo. ");
            lado3 = scan.nextFloat();
         
            if ((lado1 + lado2) <= lado3 || (lado1 + lado3) <= lado2 || (lado2 + lado3) <= lado1) {
                System.out.println("Essas medidas não podem ser um triangulo! ");
                
            } else {
                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("Triângulo EQUILÁTERO, sendo também um triângulo ISÓCELE. "); 
                    
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Triângulo ISÓCELE. ");
                    
                } else {
                    System.out.println("Triângulo ESCALENO. ");
                }
            }
            
            do {
                System.out.println("Deseja informar outras medidas? 'S'-continuar ou 'N'-finalizar. ");
                desejaContinuar = scan.next().charAt(0);
                 
                switch (desejaContinuar){
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
