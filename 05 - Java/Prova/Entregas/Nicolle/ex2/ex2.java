import java.util.Arrays;

public class ex2{

    public static void main(String[] args) {
        int[] vetor = new int[12];
        vetor[0] = 0;
        vetor[1] = 1;
        for(int i = 0; i < vetor.length; i++)
        {
            vetor[i] = vetor[i - 1] + vetor[i - 2];
            System.out.println(vetor[i]);

        }
    
        // System.out.println("%d", vetor);

    }
}