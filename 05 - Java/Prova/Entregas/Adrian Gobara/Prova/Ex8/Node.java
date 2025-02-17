
public class Node {

    private Node next;
    private Node prev;
    private TrainContent data;

    Node(TrainContent data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node(TrainContent data) {
        
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public TrainContent getData() {
        return data;
    }

    public void setData(TrainContent data) {
        this.data = data;
    }
}
