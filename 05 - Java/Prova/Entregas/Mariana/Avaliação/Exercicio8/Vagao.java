enum TrainContent {
    VAZIO,
    COMBUSTIVEL,
    TRIGO,
    ANIMAIS,
    PASSAGEIROS
}

public class Vagao {
    private TrainContent conteudo;
    private Vagao prev;
    private Vagao next;

    public Vagao(TrainContent conteudo) {
        this.conteudo = conteudo;
    }

    public TrainContent getConteudo() {
        return conteudo;
    }

    public void setConteudo(TrainContent conteudo) {
        this.conteudo = conteudo;
    }

    public Vagao getPrev() {
        return prev;
    }

    public void setPrev(Vagao prev) {
        this.prev = prev;
    }

    public Vagao getNext() {
        return next;
    }

    public void setNext(Vagao next) {
        this.next = next;
    }
}
