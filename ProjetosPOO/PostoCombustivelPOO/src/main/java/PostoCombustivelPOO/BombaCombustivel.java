
package PostoCombustivelPOO;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class BombaCombustivel {

    private String tipoCombustivel;
    private Float valorLitroCombust;
    private float qtdCombustivel;
    
    public BombaCombustivel() {
        
    }
    
    public void abastecerPorValor() {
        Scanner scan = new Scanner(System.in);
        float valorAAbastecer;
        
        System.out.println("Informe o valor a ser abastecido. ");
        valorAAbastecer = scan.nextFloat();
        
        if (tipoCombustivel == "Álcool") {
            
        } else if (tipoCombustivel == "Gasolina") {
            
        } else {
            
        }
    }
    
    public void abasterPorLitro() {
        
    }
    
    public void alterarValor() {
        
    }
    
    public void alterarCombustivel() {
        
    }
    
    public void alterarQuantidadeCombustivel() {
        
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
        this.qtdCombustivel = qtdCombustivel;
    }
    
    
}
