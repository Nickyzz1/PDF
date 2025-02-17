package Prova.questao8;

// Enum para representar o conteúdo do Vagão
enum TrainContent {
    VAZIO,
    COMBUSTIVEL,
    TRIGO,
    ANIMAIS,
    PASSAGEIROS
}

public class Vagao {
    private TrainContent conteudo;
    private Vagao vagaoAnterior;
    private Vagao proximoVagao;

    // Construtor da classe
    public Vagao(TrainContent conteudo) {
        this.conteudo = conteudo;
    }

    //Métodos get e set
    public TrainContent getConteudo() {
        return conteudo;
    }

    public void setConteudo(TrainContent conteudo) {
        this.conteudo = conteudo;
    }

    public Vagao getVagaoAnterior() {
        return vagaoAnterior;
    }

    public void setVagaoAnterior(Vagao vagaoAnterior) {
        this.vagaoAnterior = vagaoAnterior;
    }

    public Vagao getProximoVagao() {
        return proximoVagao;
    }

    public void setProximoVagao(Vagao proximoVagao) {
        this.proximoVagao = proximoVagao;
    }
}
