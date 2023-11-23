
package ElevadorPOO;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Elevador {
    
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador; 
    private int pessoasNoElevador;
    private char menu;
    
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
            System.out.println("Pessoas no elevador - " + this.pessoasNoElevador);
        } else {
            System.out.println("Elevador já está com sua capacidade máxima. ");
        }
    }
    
    public void sair() {
        if (pessoasNoElevador > 0) {
            pessoasNoElevador--;
            System.out.println("Pessoas no elevador - " + this.pessoasNoElevador);
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
        
        System.out.println("ANDAR - " + getAndarAtual());
    }
    
    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Elevador está no térreo. ");
        }
        
        System.out.println("ANDAR - " + getAndarAtual());
    }
    
    public void menu() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escolha uma opção. ");
        System.out.println("'A'- Entrar no elevador. ");
        System.out.println("'B'- Sair do elevador. ");
        System.out.println("'C'- Subir. ");
        System.out.println("'D'- Descer. ");
        this.menu = scan.next().charAt(0); 
    }

    public int getAndarAtual() {
        if (this.andarAtual == 0) {
            System.out.println("TÉRREO - ");
        }
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

    public char getMenu() {
        return menu;
    }

    public void setMenu(char menu) {
        this.menu = menu;
    }
        
}