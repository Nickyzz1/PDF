package question8;

public class Train {
    
    int quantity = 0;
    Wagon first = null;
    Wagon last = null;

    @SuppressWarnings("rawtypes")
    public int count(Enum content) {

        int count = 0;
        Wagon aux = first;

        while (aux != null) {
            if (aux.getContent() == content) {
                count++;
            }
            aux = aux.getNext();
        }

        return (int) count;
    }

    public void add(@SuppressWarnings("rawtypes") Enum content, int id) {

        Wagon newwagon = new Wagon(content, id);
        
        if (first == null) {
            first = newwagon;
            last = newwagon;
        }

        last.setNext(newwagon);
        newwagon.setPrevious(last);
        last = newwagon;

        // System.out.println("Added!");

    }

    public void display() {
        
        Wagon aux = first;

        while (aux != null) {
            System.err.println(aux.getId() + " - " + aux.getContent());
            aux = aux.getNext();
        }
    }

}
