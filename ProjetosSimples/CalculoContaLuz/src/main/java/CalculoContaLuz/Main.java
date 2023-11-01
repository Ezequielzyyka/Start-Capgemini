package CalculoContaLuz;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float qtdHoraMes;
        float valorConta = 0.0f;
        char entradaTipoCliente;
        String tipoCliente = "";
        char desejaContinuar = 's';
        boolean verificador;

        // Tipo de Cliente Valor do KW/h 
        //(Residência) 0,60. 
        //(Comércio) 0,48.
        //(Indústria) 1,29. 
        
        while (desejaContinuar == 's' || desejaContinuar == 'S') {
            System.out.println("Informe o a quantidade de KW/h gasta no mês. ");
            qtdHoraMes = scan.nextFloat();

            do {
                System.out.println("Informe o tipo de cliente: 'R'-Residência, 'C'-Comércio, 'I'-Indústria. ");
                entradaTipoCliente = scan.next().charAt(0); 

                switch (entradaTipoCliente) {
                    case 'r','R' -> {
                        valorConta = qtdHoraMes * 0.60f;
                        verificador = true;
                        tipoCliente = "Residência";
                    }
                    case 'c','C' -> {
                        valorConta = qtdHoraMes * 0.48f;
                        verificador = true;
                        tipoCliente = "Comércio";
                    }
                    case 'i','I' -> {
                        valorConta = qtdHoraMes * 1.29f;
                        verificador = true;
                        tipoCliente = "Indústria";
                    }
                    default -> {
                        System.out.println("Opção imválida! ");
                        verificador = false;
                    }
                }
            } while (!verificador);
            
            DecimalFormat frmt = new DecimalFormat("#.##");

            System.out.println("Conta de luz");
            System.out.println("Tipo de cliente: " + tipoCliente + "\nKW/h gasto no mes: KW/h " + qtdHoraMes
                    + "\nTotal a pagar: R$ " + frmt.format(valorConta)); 
            
            do {
                System.out.println("deseja calcular outra conta? 'S'-Continuar ou 'N'-Finalizar. ");
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
