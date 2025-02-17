public class Train
{
  public Wagon firstWagon;
  public Wagon lastWagon = firstWagon;
  public int numWagons;

  public Train() 
  {
    this.firstWagon = null;
    this.numWagons = 0;
  }

  public int count(TrainContent content) 
  {
    int count = 0;
    Wagon currentWagon = firstWagon;
    while (currentWagon != null) 
    {
      if (currentWagon.content == content) 
      {
        count++;
      }
      currentWagon = currentWagon.nextWagon;
    }
    return count;
  }

  public void addWagon(TrainContent content) 
  {
    Wagon newWagon = new Wagon(content);
    if (numWagons == 0) 
    {
      firstWagon = newWagon;
    } else 
    {
      lastWagon.nextWagon = newWagon;
      newWagon.previousWagon = lastWagon;
    }
    lastWagon = newWagon;
    numWagons++;
  }
}