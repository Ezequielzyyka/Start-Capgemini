
package Heranca;

/**
 *
 * @author Ezequiel
 */
public class Motorista extends Funcionario {
    
    private char categoriaCNH;
    private int numeroCNH;
    
    public Motorista () {
        super();
    }

    public char getCategoriaCNH() {
        return categoriaCNH;
    }

    public void setCategoriaCNH(char categoriaCNH) {
        this.categoriaCNH = categoriaCNH;
    }

    public int getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(int numeroCNH) {
        this.numeroCNH = numeroCNH;
    }
    
    
}
