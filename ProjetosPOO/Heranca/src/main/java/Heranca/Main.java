
package Heranca;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setComissaoPorItem(10); 
        v.setTotalItensVendidos(12); 
        v.setNome("Maria");
        v.setCpf("00000000000");
        v.setSalario(4800);
         
        System.out.println("Comissão por ítem = " + v.getComissaoPorItem() + "%"); 
        System.out.println("Total e ítens vendidos = " + v.getTotalItensVendidos()); 
        System.out.println("Nome do vendedor - " + v.getNome());
        System.out.println("CPF - " + v.getCpf());
        System.out.println("Salário - R$ " + v.getSalario());
        
        Motorista m = new Motorista();
        m.setCategoriaCNH('A'); 
        m.setNome("André");
        m.setCpf("09123579211");
        m.setSalario(5200);
        
        System.out.println("\nNome do motorista - " + m.getNome());
        System.out.println("Categoría CNH - " + m.getCategoriaCNH()); 
        System.out.println("CPF - " + m.getCpf());
        System.out.println("Salário - R$ " + m.getSalario());
    }
    
}
