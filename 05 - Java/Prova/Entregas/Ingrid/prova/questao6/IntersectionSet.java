package prova.questao6;

public class IntersectionSet extends Set {
    
    int array1[];
    int array2[];
    Boolean value1;
    Boolean value2;
    
    IntersectionSet(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    @Override
    public Boolean contains(float num) {
        for (int i = 0; i < array1.length; i++) {
            
            if(array1[i] == num) {
                value1 = true;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            
            if(array2[i] == num) {
                value2 = true;
            }
        }

        if(value1 && value2 == true) {
            value = true;
        }

        return value;
    }

}
