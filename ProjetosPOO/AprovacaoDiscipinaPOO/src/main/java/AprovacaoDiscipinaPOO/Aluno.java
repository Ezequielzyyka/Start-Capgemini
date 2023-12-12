
package AprovacaoDiscipinaPOO;

/**
 *
 * @author Ezequiel
 */
public class Aluno {
    
    private int matricula;
    private String nomeAluno;
    private float notaProva1, notaProva2, notaTrabalho;
    
    public Aluno () {
        
    }
    
    public float calcularMedia () {
        return ((this.notaProva1 + this.notaProva2)*2.5f + this.notaTrabalho*2)/7;
    }
    
    //Vou entender o valor 5 como média.
    public float calcularPontosParaFinal () {
        float media = calcularMedia();
        
        if (media < 2.5 || media > 5) {
            return 0;
        } else {
            return 
        }
    }
}
