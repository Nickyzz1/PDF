package Prova;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Questao_7
{
    public static void main(String[] args)
    {
		Random Rng = new Random();
		int N;
		Scanner Scan = new Scanner(System.in);
		try
		{
			System.out.println("Quantos numeros serao gerados para a simulacao?");
			N = Scan.nextInt();
		}
		catch(NumberFormatException | InputMismatchException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}
		finally
		{
			Scan.close();
		}
		Double Count = 0.0;
		for(int i = 0; i < N; ++i)
		{
			Float a = Rng.nextFloat(), b = Rng.nextFloat();
			if(Math.sqrt(a*a + b*b) < 1)
			{
				++Count;
			}
		}
		System.out.println(4*Count/N);
    }
}