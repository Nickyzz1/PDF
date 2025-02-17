import java.util.HashSet;

public class NumberSet extends Set 
{
  HashSet<Double> numbers=new HashSet<Double>();
  public NumberSet(double... numbers)
  {
    for(double number:numbers)
    {
      this.numbers.add(number);
    }
  }
  public boolean contains(double value)
  {
    return numbers.contains(value);
  }
}