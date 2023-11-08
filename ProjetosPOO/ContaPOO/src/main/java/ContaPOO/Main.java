
package ContaPOO;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        ContaCorrente pessoal = new ContaCorrente(3452,"Lucas Marcio Almeida");
        
        Scanner scan = new Scanner(System.in);
        
        char desejaContinuar = 's';
        boolean verificador;
        char menu;
        
        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            System.out.println("Escolha uma opção e digite a que deseja efetuar: ");
            System.out.println("'1'-Ver o saldo. ");
            System.out.println("'2'-Fazer um depósito. ");
            System.out.println("'3'-Fazer um saque. ");
            System.out.println("'4'-Alterar o nome. ");
            menu = scan.next().charAt(0); 
            
            switch (menu) {
                case '1' -> pessoal.mostrarSaldo();
                case '2' -> pessoal.depositar();
                case '3' -> pessoal.sacar();
                case '4' -> pessoal.alterarNome();
                default -> System.out.println("Opção inválida! ");
            }
            
            do {
                System.out.println("Deseja fazer outra operação? 'S'-SIM ou 'N'-FINALIZAR. ");
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
