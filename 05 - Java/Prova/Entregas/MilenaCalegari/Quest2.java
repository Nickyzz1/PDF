package Prova;

import java.util.Arrays;

public class Quest2 {
    public static void main(String[] args) {
        int[] vetor =  new int[12];
        vetor[0] = 0;
        vetor[1] = 1;

        for(int i = 2; i < vetor.length; i++){
            vetor[i] = vetor[i-1] + vetor[i-2];
        }

        System.out.println(Arrays.toString(vetor));
    }
}

// Será impresso :[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
// Pois ele atribui ao valor de vetor[i] a soma de vetor[i - 1] +  vetor[i-2],
// ou seja, o valor da casa é a soma dos valores de uma casa anterior a ela + a anterior da anterior