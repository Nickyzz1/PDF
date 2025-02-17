public class Main {

    public static void main(String[] args) {

        System.out.println(ParOuImpar(3));

    }

    static boolean ParOuImpar(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}