public class Exer_3 {
    
    public static Boolean getPair(int value){

        if(value%2 == 0)
            return true;
        

        return false;


    }


    public static void main(String[] args) {
        if(getPair(2))
            System.err.println("par");
    }
}
