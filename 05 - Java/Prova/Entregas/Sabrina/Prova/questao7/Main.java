package Prova.questao7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcularPi calcularPi = new CalcularPi();
        
        try {
            System.out.print("Digite o número de pontos para a simulacao: ");
            int numPontos = scanner.nextInt();

            double pontosDentroCirculo = calcularPi.calcularPi(numPontos);
            double pi = (pontosDentroCirculo / numPontos) * 4;

            System.out.println("Aproximacao de π: " + pi);

        } catch (Exception e) {
            System.out.println("Insira um numero valido");
            
        } finally {
            scanner.close();
        }
    }

}