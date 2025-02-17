public class Sets
{
  public NumberSet setA;
  public NumberSet setB;

  public Sets(NumberSet setA, NumberSet setB)
  {
    this.setA = setA;
    this.setB = setB;
  }
  public static IntersectionSet intersect(NumberSet setA, NumberSet setB)
  {
    return new IntersectionSet(setA, setB);
  }
}