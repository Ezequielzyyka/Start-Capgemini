
package AprovacaoDiscipinaPOO;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Aluno {

    private int matricula = 0;
    private String nomeAluno;
    private float notaProva1, notaProva2, notaTrabalho;

    public Aluno() {
        
    }

    public void informarDados() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do aluno. ");
        setNomeAluno(scan.nextLine());
        setMatricula(getMatricula()+1);

        System.out.println("Informe a nota da prova 1. ");
        setNotaProva1(scan.nextFloat());

        System.out.println("Informe a nota da prova 2. ");
        setNotaProva2(scan.nextFloat());

        System.out.println("Informe a nota do trabalho. ");
        setNotaTrabalho(scan.nextFloat());
    }

    public float calcularMedia() {
        return ((getNotaProva1() + getNotaProva2()) * 2.5f + getNotaTrabalho() * 2) / 7;
    }

    //Vou entender o valor 5 como média.
    public float calcularPontosParaFinal() {
        float media = calcularMedia();
                
        if (media >= 5) {
            return 0;
        } else {
            return 5 - media;
        }
    }

    public void mostrarDados () {
        System.out.println("Numero de matrícula: " + getMatricula());
        System.out.println("Nome do aluno: " + getNomeAluno());
        System.out.println("Nota da prova 1: " + getNotaProva1());
        System.out.println("Nota da prova 2: " + getNotaProva2());
        System.out.println("Nota do trabalho: " + getNotaTrabalho());
        System.out.println("Média: " + calcularMedia());
        System.out.println("Pontos necessários para a prova final: " + calcularPontosParaFinal());
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public float getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(float notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public float getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(float notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

}
