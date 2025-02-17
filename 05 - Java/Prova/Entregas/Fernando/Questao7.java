import java.util.Random;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numPts = 0, contPts = 0;
        Float x, y;
        
        while(numPts < 1)
        {
            try {
                System.out.println("Quantos pontos serao usados para a simulacao?");
                numPts = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Valor invalido!");
            }
        }
        for(int i = 0; i < numPts; i++)
        {
            x = rand.nextFloat();
            y = rand.nextFloat();

            if (Math.sqrt((x * x) + (y * y)) < 1)
            {
                contPts++;
            }
        }

        System.out.printf("O valor calculado de PI é: %.4f", (float)contPts * 4 / (float)numPts);
        sc.close();
    }   
}
