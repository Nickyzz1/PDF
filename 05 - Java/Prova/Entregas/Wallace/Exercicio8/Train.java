


public class Train {
    private Vagao head = null;
    private Integer size = 0;
    
    void add(Conteudo value)
    {
        size++;
        Vagao vagao = new Vagao(value);
        if (head == null) 
        {
            head = vagao;
            
        }
        Vagao current = head;
        // if (current.getPrev() == null) 
        // {
            //     current = current.setPrev(vagao);    
            // }
            // head = current;
            if(current.getNext() != null) 
            {
                current = current.getNext();    
            }
            current.setPrev(vagao);    
        }
        
        public Integer count(Conteudo value)
        {
            Integer contador = 0;
            Vagao current = head;
            while(current.getNext() != null) 
            {
                if (current.getValue() == value) {
                    contador++;
                }
                current = current.getNext();    
            }
            
            return contador;
        }
        
    }
