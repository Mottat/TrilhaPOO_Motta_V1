package Desafio_Compras_no_atacadao;

import java.util.ArrayList;
import java.util.Scanner;

public class Atacadao {
    public static void main(String[] args) {

        DescQTD DescQTD = new DescQTD();

        CaixaDoAtacado caixaAtacado = new CaixaDoAtacado(DescQTD);

        ArrayList<Produtos> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(new Produtos(1," | Café 1kg       | ",53.00));
        listaDeProdutos.add(new Produtos(2," | Sabão em Pó    | ",36.00));
        listaDeProdutos.add(new Produtos(3," | Caixa de Leite | ",82.00));
        listaDeProdutos.add(new Produtos(4," | Refrigente     | ",8.50));

        System.out.println("\n######################################");
        System.out.println("    Produtos disponíveis");
        System.out.println("######################################");
        for (Produtos produtos : listaDeProdutos){
            System.out.println(" *  "+ produtos + " ");
        }
        System.out.println("######################################");

        Scanner teclado = new Scanner(System.in);
        String resp = "";

        boolean found = false;

        do {
            System.out.print("\nDigite o código do produto: ");
            int codProduto = teclado.nextInt();

            for (Produtos produtos : listaDeProdutos){
                if (produtos.getId() == codProduto){
                    System.out.print("\nProduto selecionado:");
                    System.out.println("\n" + produtos);
                    double val = produtos.getValor();
                    DescQTD.setValorUnitario(val);
                    if (produtos.getId() == codProduto){
                        found = true;
                    } else {
                        System.out.println("\nProduto não encontrado");
                    }
                    break;
                }
            }

            if (!found) {
                System.out.println("\nProduto não encontrao");
                break;
            } else {
                System.out.print("\nDigite a quantidade desejada: ");
                DescQTD.setQuantidade(teclado.nextInt());

                System.out.println("\nComo deseja pagar?");
                System.out.print("(1 - Dinheiro | 2 - Débito | 3 - Crédito): ");
                DescQTD.setMeioPag(teclado.nextInt());

                caixaAtacado.computarCompra();
            }

            System.out.print("\nDeseja comprar mais algum item? [S/N] ");
            resp = teclado.next().toLowerCase();

        } while (resp.equals("s"));

        if (!found) {
            System.out.println("\nPrograma encerrado");
        } else {
            System.out.println("\nCompra finalizada com sucesso");
        }
    }
}


