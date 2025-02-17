package Exer_8;

public class Train {

    private Vagao head;
    private Vagao tail;
    private int size;

    public Train(){

        head = null;
        tail = null;
        size = 0;

    }

    public void Add(TrainContent a){
        Vagao newVagao = new Vagao(a);

        if(head == null){
            
            head = newVagao;
            tail = newVagao;
            size++;
            return;
        }

        newVagao.setPrev(tail);
        tail.setNext(newVagao);
        tail = newVagao;
        size++;

    }

    public int count(TrainContent a){

        Vagao current = head;
        int count = 0;

        while (current != null) {
            if (current.getContent().getContend() == a.getContend()){
                count++;
            }
            current = current.getNext();
        }

        return count;

    }
    public int getSize() {
        return size;
    }
}
