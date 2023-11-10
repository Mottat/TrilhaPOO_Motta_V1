package Desafio_Agenda_Telefonica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AgendaTelefonica {

    private List<Contato> contatos;
    public AgendaTelefonica(){
        contatos = new ArrayList<>();
    }

    static Scanner teclado = new Scanner(System.in);

    public void adicionarContato() {
        System.out.print("\nDigite o nome do contato: ");
        String nome = teclado.nextLine();

        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("O contato já existe na agenda.");
                return;
            }
        }
        System.out.print("Digite o telefone do contato: ");
        String telefone = teclado.nextLine();
        Contato novoContato = new Contato(nome, telefone);
        contatos.add(novoContato);
        System.out.println("Contato adicionado com sucesso: Nome: " + nome + ", Telefone: " + telefone);
    }

    public void removerContato(){
        Iterator<Contato> iterator = contatos.iterator();
        listarContatos();
        System.out.print("\nInforme o nome do contato que deseja remover: ");
        String cont = teclado.nextLine();

        while (iterator.hasNext()) {
            Contato contact = iterator.next();
            if (contact.getNome().equalsIgnoreCase(cont)) {
                iterator.remove();
                System.out.println("Contato removido: " + contact.getNome());
                return; // Stop after removing the first occurrence of the contact
            }
        }
        System.out.println("Contato não encontrado: " + cont);
    }

    public void buscarContato(){
        System.out.print("Informe o nome que deseja procurar: ");
        String cont = teclado.nextLine();

        for (Contato contato : contatos){
            if (contato.getNome().equalsIgnoreCase(cont)){
                System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
            }
        }

    }

    public void atualizarContato(){
        listarContatos();

        System.out.print("\nInforme o nome do contato que deseja alterar: ");
        String alt = teclado.nextLine();

        for (Contato contato : contatos){
            if (contato.getNome().equalsIgnoreCase(alt)){
                System.out.print("\nDigite o novo nome do contato: ");
                contato.setNome(teclado.nextLine());
                System.out.print("Digite o novo numero do contato: ");
                contato.setTelefone(teclado.nextLine());
                System.out.println("Novo contato adicionado com sucesso: Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
                return;
            }
        }
        System.out.println("O contato não existe na agenda");
    }

    public void listarContatos() {
        System.out.println("Contatos na agenda:");
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        }
    }

    public static void menu(){

        System.out.println("\n------------------------------------------");
        System.out.println(" 1 - Adicionar um novo contato");
        System.out.println(" 2 - Remover um contato existente");
        System.out.println(" 3 - Buscar um contato pelo nome");
        System.out.println(" 4 - Atualizar informações de um contato");
        System.out.println(" 5 - Listar todos os contatos na agenda");
        System.out.println(" 6 - Sair do programa");
        System.out.println("------------------------------------------");

    }

}
