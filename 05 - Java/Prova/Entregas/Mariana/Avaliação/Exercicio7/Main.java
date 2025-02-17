import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BuscarPI buscarPI = new BuscarPI();
        Scanner scanner = new Scanner(System.in);
        
        float points = 0;

        try {
            System.out.println("Quantos pontos deseja simular? ");
            points = scanner.nextFloat();
            
        } catch (NumberFormatException e) {
            System.out.println("Formato de numero invalido! ");
        } catch (InputMismatchException e){
            System.out.println("Input inválido! ");
        }

        System.out.println("PI: "+ buscarPI.Calcular(points));
    }
}
