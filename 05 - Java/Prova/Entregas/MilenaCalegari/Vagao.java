package Prova;

public class Vagao<T> {

    private Vagao<T> vagaoAnterior  =  null;
    private Vagao<T> proximoVagao = null;
    
    public Vagao<T> getVagaoAnterior() {
        return vagaoAnterior;
    }
    public void setVagaoAnterior(Vagao<T> vagaoAnterior) {
        this.vagaoAnterior = vagaoAnterior;
    }
    
    public Vagao<T> getProximoVagao() {
        return proximoVagao;
    }
    public void setProximoVagao(Vagao<T> proximoVagao) {
        this.proximoVagao = proximoVagao;
    }
}
