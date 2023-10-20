package Desafio_Compras_no_atacadao;

public class CaixaDoAtacado {

    private final DescQTD DescQTD;

    public CaixaDoAtacado(DescQTD DescQTD) { this.DescQTD = DescQTD; }

    public void computarCompra() {
        if (DescQTD.getQuantidade() <= 5) {
            DescQTD.setTaxaDesconto(0.00);
            DescQTD.calculoCompra();
        } else if (DescQTD.getQuantidade() <= 15) {
            DescQTD.setTaxaDesconto(0.10);
            DescQTD.calculoCompra();
        } else if (DescQTD.getQuantidade() <= 25) {
            DescQTD.setTaxaDesconto(0.20);
            DescQTD.calculoCompra();
        } else {
            DescQTD.setTaxaDesconto(0.25);
            DescQTD.calculoCompra();

        }
    }
}

