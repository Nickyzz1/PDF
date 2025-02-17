public class provaEx3 {
    
    public static void main(String[] args) {
        
        provaEx3 par = new provaEx3();
        System.out.println(par.ParOuImpar(5));
        System.out.println(par.ParOuImpar(2));
    }

    public boolean ParOuImpar(int value)
    {

        if (value%2 == 0){
            return true;
        } else {
            return false;
        }
    }

}