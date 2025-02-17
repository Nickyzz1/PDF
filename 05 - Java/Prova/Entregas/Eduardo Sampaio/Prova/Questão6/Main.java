package Questão6;

public class Main {
    
    public static void main(String[] args) {
        
        System.err.println("NumberSet");

        //Number Set
        NumberSet number = new NumberSet();
        Float num = new Float(10); //Valor 1
        Float num2 = new Float(12); //Valor 2

        //Adiciono o Float Valor 1 na minha classe NumberSet
        number.add(num);

        //Método contains no mesmo Float Valor 1
        if(number.contains(num))
            System.err.println("sim");
        else
            System.err.println("nao");
        
        
        //Método contains no Float Valor 2
        if(number.contains(num2))
            System.err.println("sim");
        else
            System.err.println("nao");
        
        System.err.println("\n\nIntersectionSet");


        //IntersectionSet

        NumberSet number2 = new NumberSet(num);

        IntersectionSet intersection = new IntersectionSet(number, number2);

        //Contains no Valor 1
        if(intersection.contains(num))
            System.err.println("sim");
        else
            System.err.println("nao");


        //Contains no Valor 2
        if(intersection.contains(num2))
            System.err.println("sim");
        else
            System.err.println("nao");


    }
}
