package Desafio_Orcamento_Guincho;

import java.text.NumberFormat;

public class OrcamentoGuincho {
    public static void main(String[] args) {

        TrajetoBairro trajetoBairro = new TrajetoBairro();
//        trajetoBairro.centroParaCentro();
//        trajetoBairro.bairroAParaBairroB();
        trajetoBairro.centroParaBairroA();
//        trajetoBairro.centroParaBairroB();

        Veiculo veiculo = new Carro();


        SimuladorDeOrcamento simulador = new Simulador();

        System.out.println(trajetoBairro.getDistanciaEmKM() + "km");
        System.out.println("Tipo: " + veiculo.getTipo());
        System.out.println("Estado: " + veiculo.getEstado());

        System.out.println("\nO valor total do serviço é de " +
                NumberFormat.getCurrencyInstance().format(simulador.calcularCustoTotal(veiculo,trajetoBairro)));

    }
}
