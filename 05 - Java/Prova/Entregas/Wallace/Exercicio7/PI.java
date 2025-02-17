import java.util.Random;
public class PI {
    Random rand = new Random();
    float pi;
    Integer contador = 0;
    public void descobrirPi(int numPontos) {
        try {
            Integer menorQueUm = 0;
            while (contador != numPontos) {
                float x = rand.nextFloat();
                float y = rand.nextFloat();
                double resultado = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
                if (resultado < 1) {
                    menorQueUm++;
                }
                contador++;
            }
            pi = (float)(4*menorQueUm)/(float)numPontos;
            System.out.printf("%f",pi);
        } 
            
         catch (Exception e) {
            System.out.println("Erro de imput");
        }
    }
}   
