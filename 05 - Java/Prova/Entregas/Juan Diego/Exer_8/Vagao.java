package Exer_8;

public class Vagao {

    Vagao next;
    Vagao prev;
    TrainContent content;

    Vagao(TrainContent content){

        this.content = content;
        next = null;
        prev = null;

    }

    public TrainContent getContent() {
        return content;
    }

    public void setContent(TrainContent content) {
        this.content = content;
    }
    public Vagao getNext() {
        return next;
    }
    public void setNext(Vagao next) {
        this.next = next;
    }
    public Vagao getPrev() {
        return prev;
    }
    public void setPrev(Vagao prev) {
        this.prev = prev;
    }
    
}
