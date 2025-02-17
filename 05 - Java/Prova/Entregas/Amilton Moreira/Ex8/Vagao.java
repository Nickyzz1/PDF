package Ex8;

public class Vagao 
{
    public String conteudo;
    public Vagao Next, Prev;

    public String getConteudo() 
    {
        return conteudo;
    }
    public void setConteudo(String conteudo) 
    {
        this.conteudo = conteudo;
    }
    
    public Vagao getNext() {
        return Next;
    }
    public void setNext(Vagao next) {
        Next = next;
    }
    
    public Vagao getPrev() {
        return Prev;
    }
    public void setPrev(Vagao prev) {
        Prev = prev;
    }
}
