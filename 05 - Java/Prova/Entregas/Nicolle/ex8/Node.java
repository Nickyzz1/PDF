enum TrainContent{
    vazio, combustivel, trigo
}

public class Node {

    String content; //criei um objeto boo
    private Node next; //criei um next
    private Node ant; //criei um next

    Node(String content)
    {
       this.content = content;
       next = null;
       ant = null;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getAnt() {
        return ant;
    }

    public void setAnt(Node ant) {
        this.ant = ant;
    }

}


// public class Node {

//     String item;
//     private Node head;
//     private Node ant;
//     private Node next;

//     Node(String item)
//     {
//         this.item = item;
//         next = null;
//         ant = null;
//     }

//     public String getItem() {
//         return item;
//     }
//     public void setItem(String item) {
//         this.item = item;
//     }
//     public Node getHead() {
//         return head;
//     }
//     public void setHead(Node head) {
//         this.head = head;
//     }
//     public Node getAnt() {
//         return ant;
//     }
//     public void setAnt(Node ant) {
//         this.ant = ant;
//     }
//     public Node getNext() {
//         return next;
//     }
//     public void setNext(Node next) {
//         this.next = next;
//     }
// }
