package Questao6;

public class IntersectionSet extends Set{

    Set set;
    Set set2;
    int qtd = 0;



    public IntersectionSet (Set set, Set set2, int qtd){
        this.set = set;
        this.set2 = set2;
        this.qtd = qtd;
    }

    public Double[] intersection(){
        Double intersection[] = new Double[set.getSize()];
        
        for(int i = 0; i < qtd; i++)
        {
            double valor = set.next();
            if(set2.contains(valor))
            {
                intersection[i] = valor;
            }
        }
        return intersection;
    }


    @Override
    boolean contains(Double num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    int getSize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }

    @Override
    void Add(Double num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Add'");
    }

    @Override
    double next() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }
    
}
