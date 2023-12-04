
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
    private char continuar;
    
    public Elevador() {
        
    }
    
    public void inicializar(int capacidadeElevador, int totalAndares) {
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasNoElevador = 0;
    }
    
    public void entrar() {
        if (this.capacidadeElevador > this.pessoasNoElevador) {
            this.pessoasNoElevador++;
            System.out.println("Pessoas no elevador - " + this.pessoasNoElevador);
        } else {
            System.out.println("Elevador já está com sua capacidade máxima. ");
        }
    }
    
    public void sair() {
        if (this.pessoasNoElevador > 0) {
            this.pessoasNoElevador--;
            System.out.println("Pessoas no elevador - " + this.pessoasNoElevador);
        } else {
            System.out.println("Elevador está vazio. ");
        }
    }
    
    public void subir() {
        if (this.totalAndares > this.andarAtual) {
            this.andarAtual++;
        } else {
            System.out.println("Elevador está no último andar. ");
        }
        
        System.out.println("ANDAR - " + getAndarAtual());
    }
    
    public void descer() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
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
    
    public void verificarContinuacao(String perguntaContinuacao) {
        Scanner scan = new Scanner(System.in);
        
        boolean verificador;
        do {
            System.out.println(perguntaContinuacao);
            this.continuar = scan.next().charAt(0);

            switch (this.continuar) {
                case 's','S','n','N' -> verificador = true;
                default -> {
                    System.out.println("Opção inválida! ");
                    verificador = false;
                }
            }
        } while (!verificador);
     
    }

    public int getAndarAtual() {
        if (this.andarAtual == 0) {
            System.out.println("TÉRREO ");
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

    public char getContinuar() {
        return continuar;
    }

    public void setContinuar(char continuar) {
        this.continuar = continuar;
    }
        
}
