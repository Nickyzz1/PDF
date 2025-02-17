package Trem;

public class Vagao {
    String tipo;
    
    Vagao next;
    Vagao prev;
    
    Vagao(String string){
        
        tipo = string;
        next = null;
        prev = null;
        
    }
    
    public String getTipo() {
        return tipo;
    }
    

    public Vagao getNext() {
        return next;
    }
    
    public void setNext(Vagao next) {
        this.next = next;
    }
    
    public Vagao getPrev() {
        return prev;
    }
    
    public void setPrev(Vagao prev) {
        this.prev = prev;
    }
}
