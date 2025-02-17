package question8;

public class Wagon {
    
    Wagon next;
    Wagon previous;

    @SuppressWarnings("rawtypes")
    Enum content;
    
    // for debug reasons 
    int id;

    public Wagon (@SuppressWarnings("rawtypes") Enum content, int id) {
        this.content = content;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Wagon getNext() {
        return next;
    }

    public void setNext(Wagon next) {
        this.next = next;
    }

    public Wagon getPrevious() {
        return previous;
    }

    public void setPrevious(Wagon previous) {
        this.previous = previous;
    }

    @SuppressWarnings("rawtypes")
    public Enum getContent() {
        return content;
    }


}
