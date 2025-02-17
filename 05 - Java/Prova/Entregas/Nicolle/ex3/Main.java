import java.util.Scanner;


public class Main{

    static void parORImpar(int num)
    {
        try{

            boolean result = (num%2 == 0) ? true : false;
            
            System.out.println("O numero é: " + result);

        }catch(ArithmeticException e){

            System.out.println("Erro na operação");
        }
    } 

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("===========BEM VINDO=============");
        System.out.println("DIGITE UM NUMERO PARA DESCOBRIR SE É IMPAR OU PAR: ");
        int num = scan.nextInt();

        parORImpar(num);

        scan.close();
    }
    
}