
package Exercicio22;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        int i = 0;
        for(; i < 3; i++){
            System.out.println("Digite o nome do produto: ");
            nomeProduto = scan.nextLine();
            
            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = scan.nextFloat();
            
            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = scan.nextFloat();
            scan.nextLine();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if(precoCusto == precoVenda){
                System.out.println("Houve um empate entre o preço de custo e de venda. ");
            } else {
                if(precoCusto > precoVenda){
                    System.out.println("Houve um prejuizo.");
                } else {
                    System.out.println("houve lucro.");
                }
            }
            
            System.out.println(nomeProduto + ", preço de custo = " + precoCusto
                    + ", preço de venda = " + precoVenda);
        }
        
        System.out.println("A média do preço de custo é de: " + (totalCusto/i));
        System.out.println("A média do preço de venda é de: " + (totalVenda/i));

    }
    
}
