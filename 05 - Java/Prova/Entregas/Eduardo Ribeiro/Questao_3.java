package Prova;

public class Questao_3
{
    public static boolean ParImpar(int Num)
    {
        return (Num & 1) == 0;
    }
    public static void main(String[] args)
    {
        System.out.println(ParImpar(1));
        System.out.println(ParImpar(2));
    }
}
