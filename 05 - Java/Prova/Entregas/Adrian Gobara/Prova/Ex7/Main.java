import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Quantos numeros?\n");
        int qtd = scanner.nextInt();

        // try {
        //     int qtd = scanner.nextInt();
        // } catch (NumberFormatException qtd) {
        //     throw new ErroNumero();
        // }
        // catch (InputMismatchException qtd){
        //     throw new ErroMis();
        // }
        // finally{

        // }

        Fora<Float> r =  new Fora<Float>(qtd);

        for(int i=0; i<qtd; i++)
        {
            float x = rand.nextFloat(); 
            float y = rand.nextFloat();

            float num=(x*x + y*y);

            if (num>1) {
                r.add(num);
            }

        }

        float pi = (4*r.getSize())/qtd;

        System.out.println(pi);

    }
}