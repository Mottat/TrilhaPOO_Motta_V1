package Desafio_Orcamento_Guincho;

public class Simulador implements SimuladorDeOrcamento{

    double custoTotal;

    @Override
    public double calcularCustoTotal(Veiculo veiculo, Trajeto trajeto) {
        if (veiculo.getTipo() == TipoVeiculo.ONIBUS ||
                veiculo.getTipo() == TipoVeiculo.CAMINHAO){
            this.custoTotal = trajeto.getDistanciaEmKM() * 10;
        } else if (veiculo.getEstado() == EstadoConservacao.valueOf("QUEBRADO")){
            this.custoTotal = trajeto.getDistanciaEmKM() * 2;
        } else {
            this.custoTotal = trajeto.getDistanciaEmKM() * 5;
        }
        return custoTotal;
    }
}
