public class Vagao extends Train
{
    Vagao next;
    public Vagao getNext() {
        return next;
    }
    public void setNext(Vagao next) {
        this.next = next;
    }


    Vagao prev;
    public Vagao getPrev() {
        return prev;
    }
    public void setPrev(Vagao prev) {
        this.prev = prev;
    }
}
