package question3;

public class Main {

    public static void main(String[] args) {
        
    EvenOrOdd test = new EvenOrOdd();

    
    for (int i = 0; i < 10; i++ ) {
        boolean result = test.check(i);
        System.out.println("O número " + i + " é par? R: " + result);

    }

    }
}