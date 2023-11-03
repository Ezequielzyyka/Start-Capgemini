
package Heranca;

/**
 *
 * @author Ezequiel
 */
public class Vendedor extends Funcionario {
    
    private int totalItensVendidos;
    private float comissaoPorItem;
    
    public Vendedor () {
        super();
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
    
}
