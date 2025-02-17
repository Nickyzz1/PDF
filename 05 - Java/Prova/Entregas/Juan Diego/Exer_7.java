import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Exer_7 {
    
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean NaN = true;
        int points =1;
        while (NaN) {
            
            try{
                System.err.println("Digite quantas vezes deseja realizar a simulação");
                points = scan.nextInt();
                NaN = false;
            }catch(Exception e){
                NaN = true;
            }
            
        }

        

        for(int i=0;i<points;i++){

            Random rand = new Random();

            float x;
            float y;
            float pi;

            do{
                x = rand.nextFloat();
                y = rand.nextFloat();
                x = (float) Math.pow(x, 2);
                y = (float) Math.pow(y, 2);
                pi = (float)Math.sqrt(x+y);

            }while( pi < 1);

            System.err.println("Pontos escolido x =" + x);
            System.err.println("Pontos escolido y =" + y);
     
            
            pi *= 4;
            System.err.println(pi);

        }
        

        scan.close();
  
    }
}
