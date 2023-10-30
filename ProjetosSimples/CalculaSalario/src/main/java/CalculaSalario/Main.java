
package CalculaSalario;

import java.util.Scanner;
/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        float qtdHorasTrabalhada;
        float salario = 0.0f;
        int nivelProfessor;
        char desejaContinuar = 's';
        boolean verificador;
        
        // Professor Nível 1 R$12,00 por hora/aula; 
        // Professor Nível 2 R$17,00 por hora/aula; 
        // Professor Nível 3 R$25,00 por hora/aula.
        
        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            System.out.println("Informe a quantidade de horas trabalhada pelo professor. ");
            qtdHorasTrabalhada = scan.nextFloat();
            
            System.out.println("Informe o nível do professor: nivel (1), (2) ou (3). ");
            nivelProfessor = scan.nextInt();
            
            if (nivelProfessor == 1) {
                salario = qtdHorasTrabalhada * 12;
            } else if (nivelProfessor == 2) {
                salario = qtdHorasTrabalhada * 17;
            } else if (nivelProfessor == 3) {
                salario = qtdHorasTrabalhada * 25;
            } else {
                System.out.println("Nível não registrado! ");
                salario = 0.0f;
            }
            
            System.out.println("SALÁRIO = R$ " + salario);
            
            do {
                System.out.println("Deseja calcular outro salário? 'S'-continuar ou 'N'-finalizar. ");
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
