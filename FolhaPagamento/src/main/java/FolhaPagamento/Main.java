
package FolhaPagamento;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String nomeVendedor;
        float salarioFixo;
        float totalvendas;
        float comissao;
        
        System.out.println("Informe o nome do vendedor: ");
        nomeVendedor = scan.nextLine();
        
        System.out.println("Informe o salário fixo do vendedor: ");
        salarioFixo = scan.nextFloat();
        
        System.out.println("Informe o total de vendas em dinheiro no mês: ");
        totalvendas = scan.nextFloat();
        
        comissao = (15*totalvendas)/100;

        System.out.println("Nome do vendedor - " + nomeVendedor +
                "\nSalário fixo - R$ " + salarioFixo + 
                "\nSalário total - R$ " + (salarioFixo + comissao));
    }
    
}