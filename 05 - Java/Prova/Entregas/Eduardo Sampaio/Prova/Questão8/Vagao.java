package Questão8;

public class Vagao {

    private TrainContent content;
    private Vagao next = null;

    Vagao(TrainContent content)
    {
        content = this.content;
    }

    public String getContent()
    {
        return content.getContent();
    }
    
    public Vagao getNext() {
        return next;
    }

    public void setNext(Vagao next) {
        this.next = next;
    }

}
