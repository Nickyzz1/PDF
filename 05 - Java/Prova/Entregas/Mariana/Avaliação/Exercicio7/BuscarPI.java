import java.util.Random;

public class BuscarPI {
    public float r = 0;
    public float b = 0;
    public float pi = 0;

    public BuscarPI() {}

    public float Calcular(float qtd_pontos){
        
        for(int i = 0; i < qtd_pontos; i++){
            Random rand = new Random();
            float x = rand.nextFloat();
            float y = rand.nextFloat();

            double soma_quadrados = (Math.pow(x, 2)) + (Math.pow(y, 2));

            if((Math.sqrt(soma_quadrados)) < 1){
                r = r + 1;
            }

            soma_quadrados = 0;
        }

        b = qtd_pontos - r;

        pi = (4*r)/qtd_pontos;

        return pi;
    }




}
