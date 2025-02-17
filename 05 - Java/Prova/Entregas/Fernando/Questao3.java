public class Questao3 {
    static boolean parImpar(int num)
    {
        return (num % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(parImpar(7));
        System.out.println(parImpar(10));
    }
}