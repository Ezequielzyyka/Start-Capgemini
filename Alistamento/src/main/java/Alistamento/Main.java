package Alistamento;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        int contadorApto = 0,
                contadorNaoApto =0,
                contadorTotal = 0;                
        char sexo, saudavel;
        char continuar = 's';
       
        while (continuar == 's' || continuar == 'S') {
            System.out.println("Informe o nome. ");
            nome = scan.nextLine();
            
            System.out.println("Informe o sexo: 'M'-masculino ou 'F'-feminino. ");
            sexo= scan.next().charAt(0);
            
            System.out.println("Informe a idade. ");
            idade = scan.nextInt();
            
            System.out.println("Informe o estado de saúde: 'S'-saudável ou 'N'-com problemas de saúde. ");
            saudavel = scan.next().charAt(0); 
            
            if(sexo == 'm' || sexo == 'M'){
                if(idade >= 18){
                    if( saudavel == 's' || saudavel == 'S'){
                        System.out.println("Está apto para cumprir serviço militar obrigatótio. ");
                        contadorApto++;
                                
                    } else {
                        System.out.println("É Preciso ter boa saúde para se alistar. ");
                        contadorNaoApto++;
                    }
                } else{
                    System.out.println("Idade de obrigatoriedade não alcançada. ");
                    contadorNaoApto++;
                }
            } else {
                System.out.println("Mulheres são isentas do serviço militar em tempos de paz. ");
                contadorNaoApto++;
            }
            
            contadorTotal++;
            
            System.out.println("Deseja fazer outra consulta para alistamento? 'S'-continuar ou 'N'-finalizar.");
            continuar = scan.next().charAt(0);
            scan.nextLine();
        }
        
        System.out.println("Quantidade de pessoas aptas ao alistamento: " + contadorApto 
                + "\nQuantidade de pessoas nao aptas para se alistar: " + contadorNaoApto 
                + "\nQuantidade de consultas: " + contadorTotal);
    }

}
