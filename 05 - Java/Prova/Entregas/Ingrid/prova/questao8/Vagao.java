package prova.questao8;

public class Vagao<T> {
    
    private Vagao<T> next = null;
    private Vagao<T> prev = null;
    private T value;
    private Trem valor;

    
    public Vagao(T value) {
        this.value = value;
    }
    
    public Vagao<T> getNext() {
        return next;
    }
    
    public void setNext(Vagao<T> next) {
        this.next = next;
    }
    
    public Vagao<T> getPrev() {
        return prev;
    }
    
    public void setPrev(Vagao<T> prev) {
        this.prev = prev;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
    
    public Trem getValor() {
        return valor;
    }
    
    public void setValor(Trem valor) {
        this.valor = valor;
    }
}