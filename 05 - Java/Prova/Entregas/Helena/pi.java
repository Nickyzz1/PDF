import java.util.Random;
import java.util.Scanner;

public class pi {

    public static void main(String[] args) {
        
        int r=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de pontos: ");
        int quantidadePontos = scan.nextInt();
        
        for (int i = 0; i < quantidadePontos; i++) {
            Random rand = new Random();
            
    
            float x = rand.nextFloat();
            float y = rand.nextFloat();
            
            float x2 = x * x;
            float y2 = y * y;
            float equacao = (x2 + y2);
            
            if (equacao < 1) {
                r++;
            }
        }


        float result = (r*4)/quantidadePontos;
        System.out.println("result: " + result);
    }
}