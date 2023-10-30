package ComparadorIgualdade;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2;
        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.println("Digite um número: ");
            num1 = scan.nextInt();

            System.out.println("Digite outro número: ");
            num2 = scan.nextInt();

            if (num1 == num2) {
                System.out.println("Os números informados são iguais! \n" + num1 + "=" + num2);

            } else {
                if (num1 > num2) {
                    System.out.println("Os números informados são diferentes, sendo o primeiro número maior que o segundo! \n"
                            + num1 + ">" + num2);
                } else {
                    System.out.println("Os números informados são diferentes, sendo o primeiro número menor que o segundo! \n"
                            + num1 + "<" + num2);
                }
            }

            boolean condicao;
            do {
                System.out.println("Deseja fazer outra comparação? 'S'-SIM ou 'N'-FINALIAR. ");
                continuar = scan.next().charAt(0);

                switch (continuar) {
                    case 's', 'S', 'n', 'N' ->
                        condicao = true;
                    default -> {
                        System.out.println("Opção inválida! ");
                        condicao = false;
                    }
                }
            } while (!condicao);
        }
    }

}
