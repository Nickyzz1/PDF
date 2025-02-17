package Prova.questao6;

public abstract class List<T> {
    protected int size = 0;
    public int getSize(){return size;}
    protected void setSize(int size){this.size = size;}
    public abstract T get(int index);
    public abstract void set(int index, T value);
    public abstract void add(T value);


}
