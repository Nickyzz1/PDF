import java.util.HashSet;

public class Train 
{
    Vagao next;
    Vagao prev;
    int quantity = 0;
    
    
    int count(TrainContent content)
    {
        Vagao vagao = new Vagao();

        while (vagao.getNext() != null) {
            if (vagao.content) {
                quantity+=1;
            }
        }
        return quantity;
    }


    void add(TrainContent content)
    {
        Vagao vagao = new Vagao();
        vagao.content;

        next.setNext(vagao);
        vagao.setPrev(next);

        quantity+=1;
    }
}
