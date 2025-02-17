package Prova;

public class Trem<T> {
    private Vagao<T> primeiroVagao;
    private Vagao<T> ultimoVagao;
    private Integer qtdVagoes;

    public enum TrainContent{
        Vazio, Combustivel,
        Trigo, Passageiros;
    }

    
    Trem(){
        this.primeiroVagao = null;
        this.ultimoVagao = null;
        this.qtdVagoes = 0;
    }
    
    void Add(TrainContent vagao){
        qtdVagoes++;
        Vagao<T> node = new Vagao(vagao(1));

        if(primeiroVagao == null){
            primeiroVagao = node;
            ultimoVagao = node;

            return;
        }

        ultimoVagao.setProximoVagao((node));
        node.setVagaoAnterior((ultimoVagao));
        ultimoVagao = node;
    }
    
    int count(TrainContent vagoes){
        
    }


}

