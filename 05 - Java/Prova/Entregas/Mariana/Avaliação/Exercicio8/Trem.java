public class Trem {
    private Vagao head;

    public int count(TrainContent conteudo) {
        int count = 0;

        Vagao atual = head;

        while (atual != null) {

            if (atual.getConteudo() == conteudo) 
            {
                count++;
            }

            atual = atual.getNext();
        }

        return count;
    }

    public void add(TrainContent conteudo) {

        Vagao node = new Vagao(conteudo);

        if (head == null) {

            head = node;

        } else {

            Vagao tail = head;

            while (tail.getNext() != null)
            {
                tail = tail.getNext();
            }

            tail.setNext(node);
            node.setPrev(tail);
        }
    }
}
