package Desafio_Orcamento_Guincho;

public class Carro implements Veiculo{

    private TipoVeiculo tipo;
    private EstadoConservacao estado;

    public Carro() { this.tipo = TipoVeiculo.CARRO; }

    public void setEstado(EstadoConservacao estado) {
        this.estado = estado;
    }

    @Override
    public TipoVeiculo getTipo() {
        return tipo;
    }

    @Override
    public EstadoConservacao getEstado() {
        return estado;
    }
}
