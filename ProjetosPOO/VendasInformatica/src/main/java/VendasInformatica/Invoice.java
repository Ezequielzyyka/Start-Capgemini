
package VendasInformatica;

/**
 *
 * @author Ezequiel
 */
public class Invoice {
    
    private int idProduto;
    private String descricaoProduto;
    private int qtdItemVendido;
    private double precoProduto;
    
    public Invoice () {
        this.idProduto = 0;
        this.descricaoProduto = "";
        this.qtdItemVendido = 0;
        this.precoProduto = 0.0;
    }
    
    public double getInvoiceAmount () {
        return getQtdItemVendido() * getPrecoProduto();
    }
 
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQtdItemVendido() {
        return qtdItemVendido;
    }

    public void setQtdItemVendido(int qtdItemVendido) {
        this.qtdItemVendido = qtdItemVendido;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    
}

