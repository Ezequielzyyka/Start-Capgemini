
package ElevadorPOO;

/**
 *
 * @author Ezequiel
 */
public class Elevador {
    
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador; 
    private int pessoasNoElevador;
    
    public Elevador() {
        
    }
    
    public void inicializar(int capacidadeElevador, int totalAndares) {
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasNoElevador = 0;
    }
    
    public void entrar() {
        if (capacidadeElevador > pessoasNoElevador) {
            pessoasNoElevador++;
        } else {
            System.out.println("Elevador já está com sua capacidade máxima. ");
        }
    }
    
    public void sair() {
        if (pessoasNoElevador > 0) {
            pessoasNoElevador--;
        } else {
            System.out.println("Elevador está vazio. ");
        }
    }
    
    public void subir() {
        if (totalAndares > andarAtual) {
            andarAtual++;
        } else {
            System.out.println("Elevador está no último andar. ");
        }
    }
    
    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Elevador está no térreo. ");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getPessoasNoElevador() {
        return pessoasNoElevador;
    }

    public void setPessoasNoElevador(int pessoasNoElevador) {
        this.pessoasNoElevador = pessoasNoElevador;
    }
        
}
