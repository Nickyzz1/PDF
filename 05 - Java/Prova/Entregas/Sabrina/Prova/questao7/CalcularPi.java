package Prova.questao7;
import java.util.Random;

public class CalcularPi {

    public double calcularPi (int numPontos){
        Random rand = new Random();
        double pontosDentroCirculo = 0;
    
        for (int i = 0; i < numPontos; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
    
            if (Math.sqrt(x*x + y*y) < 1) {
                pontosDentroCirculo++;
            }
        }
    
        return pontosDentroCirculo;

    }
}
