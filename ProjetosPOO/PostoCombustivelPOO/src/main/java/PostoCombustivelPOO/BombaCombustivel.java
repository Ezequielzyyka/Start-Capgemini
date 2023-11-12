
package PostoCombustivelPOO;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class BombaCombustivel {

    private String tipoCombustivel;
    private float valorLitroCombust = 0.0f;
    private float qtdCombustivel;

    public BombaCombustivel() {

    }

    public void abastecerPorValor() {
        Scanner scan = new Scanner(System.in);
        float valorAAbastecer;
        float qtdCombust;

        if (this.valorLitroCombust <= 0) {
            System.out.println("Combustível sem especificação de presso! "
                    + "\nPreço atual - " + this.tipoCombustivel + " - R$ " + this.valorLitroCombust);

        } else {
            System.out.println("Informe o valor a ser abastecido. ");
            valorAAbastecer = scan.nextFloat();

            qtdCombust = this.qtdCombustivel - (valorAAbastecer / this.valorLitroCombust);

            setQtdCombustivel(qtdCombust);
            if (qtdCombust >= 0) {
                System.out.println("Litros abastecidos - " + (valorAAbastecer / this.valorLitroCombust) + " litros");
            }
        }
    }

    public void abasterPorLitro() {
        Scanner scan = new Scanner(System.in);
        int qtdLitrosAbastecer;
        float qtdCombust;
       
        if (this.valorLitroCombust <= 0) {
            System.out.println("Combustível sem especificação de presso! "
                    + "\nPreço atual - " + this.tipoCombustivel + " - R$ " + this.valorLitroCombust);

        } else {
            System.out.println("Informe a quantidade de litros a ser abastecido. ");
            qtdLitrosAbastecer = scan.nextInt();
            
            qtdCombust = this.qtdCombustivel - qtdLitrosAbastecer;
            
            setQtdCombustivel(qtdCombust);
            if (qtdCombust >= 0) {
                
                
                System.out.println("Valor a pagar R$ " + (this.valorLitroCombust * qtdLitrosAbastecer));
            }
        }
    }

    public void alterarValor() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do combustível. ");
        this.valorLitroCombust = scan.nextFloat();
    }

    public void alterarCombustivel() {
        Scanner scan = new Scanner(System.in);
        char combustivel;

        System.out.println("Informe o tipo de combustível: 'A'-Álcool, 'G'-Gasolina ou 'D'-Diesel. ");
        combustivel = scan.next().charAt(0);

        switch (combustivel) {
            case 'á','Á','a','A' -> this.tipoCombustivel = "Álcool";
            case 'g','G' -> this.tipoCombustivel = "Gasolina";
            case 'd','D' -> this.tipoCombustivel = "Diesel";
            default -> {
                System.out.println("Opção inválida! ");
                this.tipoCombustivel = "";
                scan.nextLine();
            }
        }
        

    }

    public void alterarQuantidadeCombustivel() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade que deseja abastecer o reservatório da bomba. ");
        setQtdCombustivel(scan.nextFloat() + this.qtdCombustivel);
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Float getValorLitroCombust() {
        return valorLitroCombust;
    }

    public void setValorLitroCombust(Float valorLitroCombust) {
        this.valorLitroCombust = valorLitroCombust;
    }

    public float getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(float qtdCombustivel) {

        if (qtdCombustivel < 0) {
            System.out.println("Bomba não contem quantidade de combustível suficiente no reservatório! \n" + this.tipoCombustivel );
            System.out.println("Quntidade restante - " + getQtdCombustivel() + " litros. ");
        } else if (qtdCombustivel > 10000) {
            System.out.println("Reservatório da bomba não cabe essa quantidade de combustível! \n" 
                    + this.tipoCombustivel + "\nLimite máximo 10000 litros! ");
            System.out.println("Quantidade existente no reservatório - " + getQtdCombustivel() +" litros. ");
        } else {
            this.qtdCombustivel = qtdCombustivel;
        }
    }
    
    
}
