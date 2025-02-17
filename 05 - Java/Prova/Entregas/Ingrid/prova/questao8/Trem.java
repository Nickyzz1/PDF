package prova.questao8;

public class Trem<T> {

    private Integer size = 0;
    private Vagao<T> tail = null;
    private Vagao<T> head = null;
    private Vagao<T> vagao;
    private TrainContent trainContent;
    private int cont = 0;
    
    int count(TrainContent content) {
        
        for(int i; i < size; i++) {
            
            if(vagao.getValor() == trainContent.getOp()) {
                cont++;
            }
        }
        
        return size;
        
    }
    
    void add(T content) {
        
        size++;
        
        Vagao<T> vagao = new Vagao<T>(content);
        
        if(head == null) {
            head = vagao; 
            tail = vagao; 
            return;
        }
        
        tail.setNext(vagao); //tail faz referência ao último valor adicionado na lista (vagao)
        vagao.setPrev(tail); //vagao faz referência ao valor adicionado antes do dele mesmo (tail)
        tail = vagao;
    }
    
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}