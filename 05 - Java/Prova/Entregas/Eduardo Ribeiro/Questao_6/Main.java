package Prova.Questao_6;

public class Main
{
    public static void main(String[] args)
    {
        Double[] D1 = {1.0, 1.2, 1.5, 1.8, 2.1, 2.5};
        Double[] D2 = {1.0, 1.1, 1.3, 1.8, 2.5, 2.7};

        NumberSet Ns1 = new NumberSet(D1);
        NumberSet Ns2 = new NumberSet(D2);
        IntersectionSet Is = new IntersectionSet(Ns1, Ns2);

        System.out.println(Ns1.contains(1.2));
        System.out.println(Ns2.contains(1.2));
        System.out.println(Is.contains(1.2));
        System.out.println(Is.contains(1.8));
    }    
}