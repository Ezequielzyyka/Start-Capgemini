package VendaVeiculos;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float valorAPagar, valorInicial;
        float valorDesconto = 0.0f;
        float totalDesconto = 0.0f;
        float totalVendas = 0.0f;
        String veiculo;
        char entradaTipoCombustivel;
        String saidaTipoCombustivel = "";
        int alcool = 25;         // 25% de desconto nos veículos a alcool.
        int gasolina = 21;       // 21% de desconto nos veículos a gasolina.
        int diesel = 14;         // 14% de desconto nos veículos a diesel.
        boolean validacao;

        do {

            System.out.println("Informe o nome do veículo. ");
            veiculo = scan.nextLine();

            System.out.println("Informe o valor do veículo. ");
            valorInicial = scan.nextFloat();
            if (valorInicial == 0) {
                break;
            }

            do {
                System.out.println("Informe o tipo de combustível que o veículo utiliza: 'A'-Álcool, 'G'-Gasolina ou 'D'-Diesel. ");
                entradaTipoCombustivel = scan.next().charAt(0); 
                scan.nextLine();

                switch (entradaTipoCombustivel) {
                    case 'a', 'A' -> {
                        saidaTipoCombustivel = "Álcool";
                        valorDesconto = (alcool * valorInicial) / 100;
                        totalDesconto = totalDesconto + valorDesconto;
                        validacao = true;
                    }
                    case 'g', 'G' -> {
                        saidaTipoCombustivel = "Gasolina";
                        valorDesconto = (gasolina * valorInicial) / 100;
                        totalDesconto = totalDesconto + valorDesconto;
                        validacao = true;
                    }
                    case 'd', 'D' -> {
                        saidaTipoCombustivel = "Diesel";
                        valorDesconto = (diesel * valorInicial) / 100;
                        totalDesconto = totalDesconto + valorDesconto;
                        validacao = true;
                    }
                    default -> {
                        System.out.println("Opção iválida! ");
                        validacao = false;
                    }
                }

            } while (!validacao);

            valorAPagar = valorInicial - valorDesconto;
            totalVendas = totalVendas + valorAPagar;

            System.out.println("'-CARANGO_'");
            System.out.println("Veículo:  " + veiculo + "\nValor do veículo: R$ " + valorInicial
                    + "\nTipo de combustível: " + saidaTipoCombustivel + "\nValor do desconto: R$ " + valorDesconto
                    + "\nTotal a pagar: R$ " + valorAPagar);

            System.out.println("\nPara finalizar, informe valor zero no valor do veículo. ");

        } while (valorInicial != 0);

        System.out.println("Total de descontos: R$ " + totalDesconto
                + "\nTotal de vendas: R$ " + totalVendas);
    }

}
