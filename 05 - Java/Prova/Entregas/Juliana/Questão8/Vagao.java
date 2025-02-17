public class Vagao<T> { 
    
    private Vagao<TrainContent> next;
    private Vagao<TrainContent> previous;
    private TrainContent value;
    
    public TrainContent getValue() {
        return value;
    }

    public void setValue(TrainContent value) {
        this.value = value;
    }

    public Vagao(TrainContent value) {
        this.value = value;
    }

    public Vagao<TrainContent> getNext() {
        return next;
    }
    
    public void setNext(Vagao<TrainContent> next) {
        this.next = next;
    }
    
    public Vagao<TrainContent> getPrevious() {
        return previous;
    }
    
    public void setPrevious(Vagao<TrainContent> previous) {
        this.previous = previous;
    }

    


    

}
