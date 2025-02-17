import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

class Main 
{
  public static void main(String[] args) 
  {
    var rand=new Random();
    var scanner = new Scanner(System.in);
    int counter = 0;
    try
    {
      System.out.println("Enter the number of dots: ");
      int dotsNum = scanner.nextInt();
      for (int k = 0; k < dotsNum; k++) 
      {
        var x = rand.nextFloat();
        var y = rand.nextFloat();
        if (Math.sqrt((x*x)+(y*y)) < 1) 
        {
          counter++;
        }
      }
      System.out.println("The number of dots in the circle is: " + counter);
      System.out.println("The value of pi is: " + (4.0*counter/dotsNum));
    } catch (NumberFormatException e) 
    {
      System.out.println("Invalid input");
    } catch (InputMismatchException e) 
    {
      System.out.println("Invalid input");
    } finaly 
    {
      scanner.close();
    }
  }
}