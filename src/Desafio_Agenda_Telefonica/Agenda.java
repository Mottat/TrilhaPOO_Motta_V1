package Desafio_Agenda_Telefonica;

import java.util.Scanner;


public class Agenda {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int escolha = 0;

        AgendaTelefonica agenda = new AgendaTelefonica();

        while (escolha != 6){

            AgendaTelefonica.menu();

            System.out.print("\nESCOLHA UMA OPÇÂO: ");
            escolha = teclado.nextInt();

            if (escolha == 1){
                agenda.adicionarContato();
            } else if (escolha == 2) {
                agenda.removerContato();
            } else if (escolha == 3){
                agenda.buscarContato();
            } else if (escolha == 4) {
                agenda.atualizarContato();
            } else if (escolha == 5) {
                agenda.listarContatos();
            } else if(escolha != 6){
                System.out.println("\nEscolha uma das opções");
            }
        }
        System.out.println("\nPrograma encerrado");
    }

}
