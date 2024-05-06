
package SalarioFuncionarios;

/**
 *
 * @author Ezequiel
 */
public class Funcionario {
    
    private String primeiroNome;
    private String sobrenome;
    private float salarioMensal;

    public Funcionario(String primeiroNome, String sobrenome, float salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal >= 0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0f;
        }
    }
    
    
}
