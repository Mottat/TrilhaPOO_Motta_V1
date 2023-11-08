package Desafio_Orcamento_Guincho;

public class TrajetoBairro implements Trajeto {
    private int distanciaEmKM;

    public void centroParaCentro(){ setDistanciaEmKM(5); }
    public void bairroAParaBairroB(){
        setDistanciaEmKM(8);
    }
    public void centroParaBairroA(){
        setDistanciaEmKM(10);
    }
    public void centroParaBairroB(){
        setDistanciaEmKM(15);
    }

    public void setDistanciaEmKM(int distanciaEmKM) {
        this.distanciaEmKM = distanciaEmKM;
    }

    @Override
    public Integer getDistanciaEmKM() {
        return distanciaEmKM;
    }
}

