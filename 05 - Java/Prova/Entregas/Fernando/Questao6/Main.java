package Questao6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Set set1 = new NumberSet();
        Set set2 = new NumberSet();
        Scanner sc = new Scanner(System.in);
        int set1qtd = 0, set2qtd = 0;

        while(set1qtd < 1)
        {
            try {
                System.out.printf("Digite quantos valores tera o set 1: ");
                set1qtd = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Valor invalido!");
            }
        }
        while(set2qtd < 1)
        {
            try {
                System.out.printf("Digite quantos valores tera o set 2: ");
                set2qtd = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Valor invalido!");
            }
        }

        for(int i = 0; i < set1qtd; i++)
        {
            System.out.printf("Digite o %d valor do set 1: ", i + 1);
            set1.Add(sc.nextDouble());
        }
        for(int i = 0; i < set2qtd; i++)
        {
            System.out.printf("Digite o %d valor do set 2: ", i + 1);
            set1.Add(sc.nextDouble());
        }

        IntersectionSet intersection = Sets.intersect(set1, set2, set1qtd);

        Double[] lista = intersection.intersection();

        for(int i = 0; i < lista.length; i++)
        {
            if(lista[i] != null)
            {
                System.out.println(lista[i]);
            }
        }

        sc.close();
    }
}
