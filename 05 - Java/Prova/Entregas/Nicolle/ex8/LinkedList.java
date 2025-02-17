enum TrainContent{
    vazio, combustivel, trigo, animais, passageiros
}

public class LinkedList{

    Node head;
    int quantVazio;
    int quantCombust;
    int quantTrigo;
    int quantAnimais;
    int quantPassengers;

    void addItems(String item)
    {
        Node newNode = new Node(item);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;
            head = newNode;
            head.setNext(temp);
            head.setAnt(temp.getNext());

            // head.setNext(temp.getNext());
            // head.setAnt(temp);

            //getant head = null
            //get next tail = null
        }
    }

    void display(LinkedList list)
    {
        Node current = head;
        int start = 0;

        while(current != null)
        {
            System.out.println("vagao:" + start);
            System.out.printf("%s \n", current.content);
            start ++;
            
            current = current.getNext();
        }
        System.out.println();
    }
    void count(String content)
    {
        if(content.equals("vazio"))
        {
            quantVazio += 1;

        }
        else if(content.equals("combustivel"))
        {
            quantCombust += 1;

        }
        else if(content.equals("trigo"))
        {
            quantTrigo += 1;

        }
        else if(content.equals("animais"))
        {
            quantAnimais += 1;

        }
        else if(content.equals("passageiros"))
        {
            quantPassengers += 1;
        }
    }

    void displayCount()
    {
        System.out.println("quantidade vagoes vazios: " + quantVazio);
        System.out.println("quantidade vagoes com combustuivel: " + quantCombust);
        System.out.println("quantidade vagoes com trigo: " + quantTrigo);
        System.out.println("quantidade vagoes com animais: " + quantAnimais);
        System.out.println("quantidade vagoes com passageiros: " + quantPassengers);

    }

    //add
    //alocar nmemoria para o item
    //ver se está vazia
    //adc ao head
    //mudar o next
}
