package Desafio_Compras_no_atacadao;

public class Produtos {

    private int id;

    private String descProduto;
    private double valor;

    public Produtos(int id, String descProduto, double valor) {
        this.id = id;
        this.descProduto = descProduto;
        this.valor = valor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescProduto() { return descProduto; }

    public void setDescProduto(String descProduto) { this.descProduto = descProduto; }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return id + " " + descProduto + " " + valor;
    }
}
