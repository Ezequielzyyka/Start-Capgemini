

package CalculoIMC;

/**
 *
 * @author Ezequiel
 */
public class Pessoa {
    
    float altura;
    float peso;
    
    public float calcularIMC (){
        float imc = peso / (altura * altura);
        return imc;
    }
    
}
