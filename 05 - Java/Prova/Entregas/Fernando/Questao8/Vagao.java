package Questao8;

public class Vagao {
    Vagao prox = null;
    Vagao prev = null;
    TrainContent conteudo;

    public TrainContent getConteudo() {
        return conteudo;
    }

    public void setConteudo(TrainContent conteudo) {
        this.conteudo = conteudo;
    }

    public Vagao getProx() {
        return prox;
    }

    public void setProx(Vagao prox) {
        this.prox = prox;
    }


    public Vagao getPrev() {
        return prev;
    }

    public void setPrev(Vagao prev) {
        this.prev = prev;
    }

}
