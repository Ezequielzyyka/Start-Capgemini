package CalculoPrecoAutomovel;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Float custoFabrica, custoVenda, impostoAplicado;
        int percentDistrib = 28;          //Percentual distribuidor = 28%
        int percentImposto = 45;          //imposto = 45%
        
        System.out.println("Informe o custo de fabrica do veículo. ");
        custoFabrica = scan.nextFloat();
        
        impostoAplicado = ((45 * custoFabrica)/ 100) + custoFabrica;
        custoVenda = ((28 * impostoAplicado)/ 100) + impostoAplicado;
        
        System.out.println("Custo de venda do veículo: R$ " + custoVenda);
    }
    
}
