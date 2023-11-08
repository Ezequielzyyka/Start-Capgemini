
package ContaPOO;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class ContaCorrente {
    
    private int numConta;
    private String nomeCorrentista;
    private float saldo;

    public ContaCorrente(int numConta, String nomeCorrentista) {
        this.numConta = numConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }
    
    public void alterarNome() {
        Scanner scan = new Scanner(System.in);
        String novoNome;
        
        System.out.println("Nome atual - " + nomeCorrentista);
        System.out.println("Informe o novo nome. ");
        setNomeCorrentista(novoNome = scan.nextLine());
    }
    
    public void depositar() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o valor a depositar. ");
        float deposito = scan.nextFloat();
        
        saldo += deposito;
    }
    
    public void sacar() {
        Scanner scan = new Scanner(System.in);
        float saque = 0;
        char tentarNovamente = 's';
        boolean verificador;

        if (saldo == 0) {
            System.out.println("Não existe dinheiro em conta! ");

        } else {

            while (tentarNovamente == 's' || tentarNovamente == 'S') {
                System.out.println("Informe o valor a sacar. ");
                saque = scan.nextFloat();

                if ((saldo - saque) < 0) {
                    System.out.println("Valor em conta insuficiente para este saque! ");
                } else {
                    saldo -= saque;
                }

                do {
                    System.out.println("Deseja tentar sacar novamente? 'S'-SIM ou 'N'-NÃO. ");
                    tentarNovamente = scan.next().charAt(0);

                    switch (tentarNovamente) {
                        case 's','S','n','N' ->
                            verificador = true;
                        default -> {
                            System.out.println("Opção inválida! ");
                            verificador = false;
                        }
                    }
                } while (!verificador);

            }
        }

    }
    
    public void mostrarSaldo() {
        System.out.println("Nome do correntista - " + getNomeCorrentista() 
                + "\nNúmero da conta - " + getNumConta() + "\nSaldo - R$ " + saldo);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
