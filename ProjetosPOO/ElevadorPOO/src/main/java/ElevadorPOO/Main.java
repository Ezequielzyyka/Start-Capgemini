package ElevadorPOO;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Elevador elevador = new Elevador();

        int capacidadeElevador, qtdAndaresPredio;
        
        elevador.setContinuar('s');          // Inicialica o atributo Continuar.

        while (elevador.getContinuar() == 's' || elevador.getContinuar() == 'S') {
            System.out.println("Informe a capacidade de pessoas que o elevador suporta. ");
            capacidadeElevador = scan.nextInt();

            System.out.println("Informe a quantidade de andares existentes no predio sem contar o térreo. ");
            qtdAndaresPredio = scan.nextInt();

            elevador.inicializar(capacidadeElevador, qtdAndaresPredio);

            while (elevador.getContinuar() == 's' || elevador.getContinuar() == 'S') {
                elevador.menu();
                switch (elevador.getMenu()) {
                    case 'a','A' -> elevador.entrar();
                    case 'b','B' -> elevador.sair();
                    case 'c','C' -> elevador.subir();
                    case 'd','D' -> elevador.descer();
                    default ->      System.out.println("Opção inválida! ");
                }

                elevador.verificarContinuacao("Deseja utilizar o elevador novamente? Tecle 'S'-SIM ou 'N'-FINALIZAR. ");
            }

            elevador.verificarContinuacao("Deseja utilizar um elevador de outro prédio? Tecle 'S'-SIM ou 'N'-FINALIZAR. ");
        }

    }

}
