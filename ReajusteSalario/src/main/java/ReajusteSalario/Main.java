package ReajusteSalario;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        char continuar;
        float salarioMinimo, salarioAtual, salarioReajustado, valorReajuste;
        float totalCustoAumentos = 0.0f;

        for (int i = 0; i < 584; i++) {

            System.out.println("Informe o nome do funcionário. ");
            nome = scan.nextLine();

            System.out.println("Informe o salário do funcionário. ");
            salarioAtual = scan.nextFloat();

            System.out.println("Informe o valor do salário mínimo atual. ");
            salarioMinimo = scan.nextFloat();

            if (salarioAtual < (salarioMinimo * 3)) {
                valorReajuste = (50 * salarioAtual) / 100;
                salarioReajustado = salarioAtual + valorReajuste;

            } else if (salarioAtual >= (salarioMinimo * 3) && salarioAtual <= (salarioMinimo * 10)) {
                valorReajuste = (20 * salarioAtual) / 100;
                salarioReajustado = salarioAtual + valorReajuste;

            } else if (salarioAtual > (salarioMinimo * 10) && salarioAtual <= (salarioMinimo * 20)) {
                valorReajuste = (15 * salarioAtual) / 100;
                salarioReajustado = salarioAtual + valorReajuste;

            } else {

                valorReajuste = (10 * salarioAtual) / 100;
                salarioReajustado = salarioAtual + valorReajuste;

            }

            totalCustoAumentos += valorReajuste;

            System.out.println("Nome: " + nome + "\nReajuste no salário: R$ "
                    + valorReajuste + "\nSalário atualizado: R$ " + salarioReajustado);

            do {
                System.out.println("Deseja adicionar outro funcionário? 'S'- CONTINUAR ou 'N'-FINALIZAR. ");
                continuar = scan.next().charAt(0); 
                scan.nextLine();
                
                switch (continuar) {
                    case 's','S','n','N' -> { 
                    }
                    default -> System.out.println("Opção inválida!");
                }

            } while (continuar != 's' && continuar != 'S' && continuar != 'n' && continuar != 'N');

            if (continuar == 'n' || continuar == 'N') {
                break;
            }
        }

        System.out.println("Aumento em folhas de pagamento: R$ " + totalCustoAumentos);

    }

}
