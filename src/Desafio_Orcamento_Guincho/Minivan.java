package Desafio_Orcamento_Guincho;

public class Minivan implements Veiculo{

    private TipoVeiculo tipo;
    private EstadoConservacao estado;

    public Minivan() {
        this.tipo = TipoVeiculo.MINIVAN;
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
