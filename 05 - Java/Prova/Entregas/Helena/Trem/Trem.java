package Trem;

public class Trem {
        
        private int size = 0; 
        private Vagao primeiroVagao = null;
        
        public Vagao getPrimeiroVagao() {
            return primeiroVagao;
        }

        private Vagao ultimoVagao = null;
    
        public void Add(String tipo){
    
            size ++;
            
            Vagao novoVagao = new Vagao(tipo);
    
            if(primeiroVagao == null){
                ultimoVagao = novoVagao;
                primeiroVagao = novoVagao; 
                return;
            }
    
            ultimoVagao.setNext(novoVagao); 
            novoVagao.setPrev(ultimoVagao); 
            ultimoVagao = novoVagao; 
    
        }
    
        public int count() {
            return size;
        }     
}