public class ParImpar {

    void parORImpar(int num)
    {
        try{

            String result = (num%2 == 0) ? "É par" : "impar";
            
            System.out.println("O numero é: " + result);

        }catch(ArithmeticException e){

            System.out.println("Erro na operação");
        }
    } 
}
