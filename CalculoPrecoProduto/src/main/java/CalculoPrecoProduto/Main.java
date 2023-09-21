package CalculoPrecoProduto;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String produto;
        Float precoCustoProduto, precoVendaProduto, percentualAcrecimo;
        
        System.out.println("Informe o nome do produto. ");
        produto = scan.nextLine();
        
        System.out.println("Informe o preço de custo do produto. ");
        precoCustoProduto = scan.nextFloat();
        
        System.out.println("Informe o percentual de acrecimo para o produto. ");
        percentualAcrecimo = scan.nextFloat();
        
        precoVendaProduto = ((percentualAcrecimo * precoCustoProduto)/100) + precoCustoProduto;
        
        System.out.println("Preço de venda: \n" + produto + "\nR$ " + precoVendaProduto);
    }
    
}
