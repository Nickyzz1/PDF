package Exercicio6;

class Set {
    
    private Integer[] data;
    
    private Integer size = 0; 

    Set (int capacity) {
        data = new Integer[capacity];
    }


    void add(Integer value) {

        if (size == data.length){

            Integer[] copy = new Integer[2  * data.length]; 

            for (int i = 0; i < size; i++){
                copy[i] = data[i];
            } 
            data = copy;
        }
        
        data[size] = value; 
        size++;
    }

    Integer size() {
        return this.size;
    }

    boolean Contains(int chave) {

        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == chave) {
                result = true;
            } 
        }

        return result;
    }

}
