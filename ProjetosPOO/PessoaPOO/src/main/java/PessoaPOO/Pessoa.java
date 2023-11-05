
package PessoaPOO;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 *
 * @author Ezequiel
 */
public class Pessoa {
    
    private String nome;
    private Date dataNascimento;
    private float altura;
    private ZoneId ZONEID = ZoneId.of("America/Sao_Paulo");
    
    public Pessoa () {
       
    }
       
    public Pessoa(String nome, Date dataNascimento, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    } 
    
    public void imprimirDados () {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Nome - " + getNome());        
        System.out.println("Data de nascimento - " + sdf.format(dataNascimento));
        System.out.println("Altura - " + getAltura() + "m");
        System.out.println("Idade - " + calcularIdade() + " anos. ");
    }

    public int calcularIdade () {
        int idade = 0;
        LocalDate dataHoje = LocalDate.now();
        if (this.dataNascimento != null) {
            LocalDate dtNascimento = ZonedDateTime.ofInstant(dataNascimento.toInstant(), ZONEID).toLocalDate();
            Period dif = dtNascimento.until(dataHoje);
            idade = dif.getYears();
        }
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
