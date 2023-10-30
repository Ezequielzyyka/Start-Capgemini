
package ConcessionariaVeiculos;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        float valorDesconto, valorAPagar, valorVeiculo;
        String veiculo;
        int anoVeiculo;
        int contadorVeiculaAte2000 = 0;
        int contadorTotalVeiculos = 0;
        char desejaContinuar = 's';
        
        while(desejaContinuar == 's' || desejaContinuar == 'S'){
            
            System.out.println("Informe o nome do veículo. ");
            veiculo = scan.nextLine();
            
            System.out.println("Informe o ano do veículo. ");
            anoVeiculo = scan.nextInt();
            
            System.out.println("Informe o valor do veículo. ");
            valorVeiculo = scan.nextFloat();
            
            if(anoVeiculo <= 2000){
                valorDesconto = (12 * valorVeiculo)/100;
                contadorVeiculaAte2000++;
            }else {
                valorDesconto = (7 * valorVeiculo)/100;
            }
            
            contadorTotalVeiculos++;
            valorAPagar = valorVeiculo - valorDesconto;
            
            System.out.println("'CARANGO VELHO'");
            System.out.println("Veículo: " + veiculo + "\nValor inicial: R$ " 
                    + valorVeiculo + "\nValoe desconto: R$ " + valorDesconto 
                    + "\nValor a pagar: R$ " + valorAPagar);
            
            System.out.println("Deseja continuar? Digite 'S'-sim ou 'N'-não. ");
            desejaContinuar = scan.next().charAt(0);
            scan.nextLine();
        }
        
        System.out.println("Total de carros com ano até 2000: " + contadorVeiculaAte2000 
                + "\nTotal de carros calculados: " + contadorTotalVeiculos);
        
    }
    
}
