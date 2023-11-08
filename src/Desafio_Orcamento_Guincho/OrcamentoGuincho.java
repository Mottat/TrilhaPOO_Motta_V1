package Desafio_Orcamento_Guincho;

import java.text.NumberFormat;

public class OrcamentoGuincho {
    public static void main(String[] args) {

        TrajetoBairro trajetoBairro = new TrajetoBairro();
        SimuladorDeOrcamento simulador = new Simulador();
        Carro veiculo = new Carro();

        trajetoBairro.centroParaCentro();
        veiculo.setEstado(EstadoConservacao.QUEBRADO);

        System.out.println("O valor total do serviço é de " +
                NumberFormat.getCurrencyInstance().format(simulador.calcularCustoTotal(veiculo,trajetoBairro)));

    }
}
