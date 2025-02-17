import java.util.Arrays;

public class Prova {
    
    public static void main(String[] args) {

        //Questão 2
        int[] vetor = new int[12];
        vetor[0] = 0;
        vetor[1] = 1;
        for(int i = 2; i < vetor.length; i++)
        {
            vetor[i] = vetor[i-1] + vetor[i-2];
        }
        System.err.println(Arrays.toString(vetor));
        

        // Questão 3 teste
        for(int i = 0; i < 100; i++){
        if(Par(i))
            System.out.print("Sim\n");
        else
            System.out.print("Nao\n");
        }
    }

    //Questão 3
    static boolean Par(int value)
    {
        return (value % 2 == 0);
    }
}
