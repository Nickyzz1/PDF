
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PI pi = new PI();
        Scanner scanne = new Scanner(System.in);
        System.out.println("Digite quantos pontos deseja colocar");
        int pontos = scanne.nextInt();
        pi.descobrirPi(pontos);
        scanne.close();
        
    }
}
