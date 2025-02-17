public class LinkedList extends List{

    private Node head;
    private Node tail;

    LinkedList()
    {
        head = null;
        tail = null;
    }

    @Override
    public void add(TrainContent value) {
        
        Node newNode = new Node((TrainContent) value);

        if (head == null) 
        {
            head = newNode;
            tail = newNode;

            setSize(getSize()+1);

            return;
        }

        tail.setNext(newNode);
        newNode.setPrev(tail);

        tail = newNode;
        setSize(getSize()+1);
    }

    @Override
    public void count(TrainContent value) {

    }
    
}
