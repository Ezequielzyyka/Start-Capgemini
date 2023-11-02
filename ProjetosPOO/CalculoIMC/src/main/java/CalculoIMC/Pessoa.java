

package CalculoIMC;

/**
 *
 * @author Ezequiel
 */
public class Pessoa {
    
    private float altura;
    private float peso;
    
    public float calcularIMC (){
        float imc = peso / (altura * altura);
        return imc;
    }
    
    public void setAltura (float altura) {
        this.altura = altura;
    }
    
    public float getAltura () {
        return altura;
    }
    
    public void setPeso (float peso) {
        this.peso = peso;        
    }
    
    public float getPeso () {
        return peso;
    }
}
