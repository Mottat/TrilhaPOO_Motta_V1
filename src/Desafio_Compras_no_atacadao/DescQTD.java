package Desafio_Compras_no_atacadao;

import java.text.NumberFormat;

public class DescQTD {

    private int quantidade;
    private int meioPag;
    private double taxaDesconto;
    private double valorUnitario;
    private double total;
    private double totalFinal;



    public DescQTD() {
        this.taxaDesconto = taxaDesconto;
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getTotal() { return total; }

    public void setTotal(double total) { this.total = total; }

    public double getTaxaDesconto() { return taxaDesconto; }
    public void setTaxaDesconto(double taxaDesconto) { this.taxaDesconto = taxaDesconto; }
    //    public double getvalorUnitario() { return valorUnitario; }
    public double getValorUnitario() { return valorUnitario; }
    public void setValorUnitario(double valorUnitario) { this.valorUnitario = valorUnitario; }

    public int getMeioPag() { return meioPag; }

    public void setMeioPag(int meioPag) { this.meioPag = meioPag; }

    public double getTotalFinal() { return totalFinal; }

    public void setTotalFinal(double totalFinal) { this.totalFinal = totalFinal; }


    public void calculoCompra(){
        double total = 0;

        setTotal((getQuantidade() * getValorUnitario()));
        double valorTotalComDesconto = getTotal() - (getTaxaDesconto() * getTotal());

        if (getMeioPag() == 1){
            double descMeioPag = valorTotalComDesconto * 0.05;
            total = valorTotalComDesconto - descMeioPag;
        } else if (getMeioPag() == 2) {
            total = valorTotalComDesconto;
        } else if (getMeioPag() == 3) {
            double acresMeioPag = valorTotalComDesconto * 0.03;
            total = valorTotalComDesconto + acresMeioPag;
        }

        setTotalFinal(total + getTotalFinal());

        System.out.println("\nTotal da compra: " + NumberFormat.getCurrencyInstance().format(getTotalFinal()));
    }
}
