import java.util.Scanner;

public class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        LinkedList trem = new LinkedList();

        System.out.println("Digite quantos vagoes deseja adicionar");
        int quant = scan.nextInt();
        scan.nextLine();

        int fla = 1;

        while(fla == 1)
        {
           for(int i = 0; i <quant; i++)
           {
            
            System.out.print("Digite uma opcao para encher cada vagao: vazio, combustivel, trigo, animais, passageiros\n");
            String content = scan.nextLine();

            trem.addItems(content);
            trem.count(content);

           }
           System.out.println("quantos vagoes com cada item: ");
           trem.displayCount();

           System.out.println("\nORGANIZAÇÃO DOS VAGOES:");
        
           trem.display(trem);
        
           
        }
        
        scan.close();
        }
}