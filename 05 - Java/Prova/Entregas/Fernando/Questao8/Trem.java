package Questao8;

public class Trem {

    Vagao primeiroVagao = null;
    
    int count(TrainContent conteudo){
        Vagao atual = primeiroVagao;
        int cont = 0;
        while(atual.getProx() != null)
        {
            if(atual.getConteudo() == conteudo)
            {
                cont++;
            }
            atual = atual.getProx();
        }
        return cont;
    }

    void Add(TrainContent conteudo){
        Vagao vagaoNovo = new Vagao();
        vagaoNovo.setConteudo(conteudo);

        if(primeiroVagao == null)
        {
            primeiroVagao = vagaoNovo;
        }
        else
        {
            Vagao atual = primeiroVagao;
            while(atual.getProx() != null)
            {
                atual = atual.getProx();
            }

            atual.setProx(vagaoNovo);
            vagaoNovo.setPrev(atual);
        }

    }
}
