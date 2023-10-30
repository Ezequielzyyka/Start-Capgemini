package OrdemNumeros;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Informe o primeiro número inteiro. ");
        num1 = scan.nextInt();

        System.out.println("Informe o segundo número inteiro. ");
        num2 = scan.nextInt();

        System.out.println("Informe o terceiro número inteiro. ");
        num3 = scan.nextInt();

        if (num1 < num2) {
            if (num2 < num3) {
                System.out.println(num1 + "," + num2 + "," + num3);
                
            } else if (num1 < num3) {
                System.out.println(num1 + "," + num3 + "," + num2);
                
            } else {
                System.out.println(num3 + "," + num1+ "," + num2);
            }
            
        } else {
            if (num1 < num3) {
                System.out.println(num2 + "," + num1 + "," + num3);
                
            } else if (num2 < num3) {
                System.out.println(num2 + "," + num3 + "," + num1);
                
            } else {
                System.out.println(num3 + "," + num2 + "," + num1);
            }
        }
    }

}
