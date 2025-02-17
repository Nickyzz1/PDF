public class IntersectionSet extends Set
{
  public NunberSet setA;
  public NunberSet setB;
  public IntersectionSet (NumberSet setA, NunberSet setB)
  {
    this.setA = setA;
    this.setB = setB;
  }
  public boolean contains(double value)
  {
    return setA.contains(value)&& setB.contains(value);
  }
}