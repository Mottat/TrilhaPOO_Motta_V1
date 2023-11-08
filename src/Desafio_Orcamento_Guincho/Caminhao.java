package Desafio_Orcamento_Guincho;

public class Caminhao implements Veiculo{

    private TipoVeiculo tipo;
    private EstadoConservacao estado;

    public Caminhao() {
        this.tipo = TipoVeiculo.CAMINHAO;
    }

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
