

public class Vagao {
   
        private Vagao next =  null;
        private Vagao prev = null;
    
        Vagao getNext()
        {
            return next;
        }
    
        void setNext(Vagao next)
        {
            this.next = next;
        }
    
        Vagao getPrev()
        {
            return prev;
        }
    
        Vagao setPrev(Vagao prev)
        {
            this.prev = prev;
            return this.prev;
        }
    
    
        private Conteudo value;
    
        Conteudo getValue()
        {
            return value;
        }
    
        Vagao(Conteudo value)
        {
            this.value = value; 
        }
    
    }

