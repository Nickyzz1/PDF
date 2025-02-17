class Main 
{
  public static void main(String[] args) 
  {
    NumberSet setA = new NumberSet(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    NumberSet setB = new NumberSet(2, 4, 6, 8, 10, 12, 14, 16);
    Sets sets = new Sets(setA, setB);
    IntersectionSet intersection = sets.intersect(setA, setB);
    System.out.println(intersection.contains(16));
  }
}