package Questão8;

public class Trem {
    
    private Vagao locomotiva = null;

    Integer count(TrainContent content)
    {
        Integer cont = 0;

        if(locomotiva == null)
        return 0;

        Vagao atual = locomotiva;

        do{
            if(atual.getContent().equals(content))
                cont++;
            atual = atual.getNext();
        }while (atual.getNext() != null);

        return cont;
    }
    
    void Add(TrainContent content)
    {
        Vagao new_vagao = new Vagao(content);

        if(locomotiva == null)
        {
            locomotiva = new_vagao;
            return;
        }
    
        Vagao atual = locomotiva;
    
        while (atual.getNext() != null) {
            atual = atual.getNext();
        }
    
        atual.setNext(new_vagao);
    
        return;
    }
}
