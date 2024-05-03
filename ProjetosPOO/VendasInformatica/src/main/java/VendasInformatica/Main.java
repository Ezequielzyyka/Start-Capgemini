package VendasInformatica;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Invoice fatura = new Invoice();

        char continuar = 's';
        boolean verificador;

        while (continuar == 's' || continuar == 'S') {
            
            System.out.println("Informe o nome do produto: ");
            fatura.setDescricaoProduto(scan.nextLine());
            fatura.setIdProduto(fatura.getIdProduto() + 1);

            System.out.println("Informe o valor do produto");
            fatura.setPrecoProduto(scan.nextDouble());

            System.out.println("Informe a quantidade de produtos vendidos: ");
            fatura.setQtdItemVendido(scan.nextInt());
            
            System.out.println("____ FATURA ____");
            System.out.println("Número do produto: " + fatura.getIdProduto());
            System.out.println("Nome do produto: " + fatura.getDescricaoProduto());
            System.out.println("Quantidade de itens na compra: " + fatura.getQtdItemVendido());
            System.out.println("Valor do produto? R$ " + fatura.getPrecoProduto());
            System.out.println("Total a pagar: R$ " + fatura.getInvoiceAmount());
            
            do{
                System.out.println("Deseja fazer outra operação? Digite 'S'- para SIM ou 'N'- para NÃO. ");
                continuar = scan.next().charAt(0);
                switch (continuar){
                    case 's','S','n','N' -> verificador = true;
                    default -> {
                        System.out.println("Opção inválida! ");
                        verificador = false;
                    }
                }
                
            } while (!verificador);
            scan.nextLine();
        }

    }

}
