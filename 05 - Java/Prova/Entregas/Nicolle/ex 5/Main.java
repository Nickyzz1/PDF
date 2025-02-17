import java.util.Scanner;

public class Main{
    public static void main(String args[])
    {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = scan.nextLine();
        System.out.println("Enter a age:");
        int age = scan.nextInt();

        Manager manager = new Manager(name, age);
        
        scan.close();

    }
}