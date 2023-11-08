package Desafio_Orcamento_Guincho;

public class Onibus implements Veiculo{

    private TipoVeiculo tipo;
    private EstadoConservacao estado;

    public Onibus() {
        this.tipo = TipoVeiculo.ONIBUS;
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
