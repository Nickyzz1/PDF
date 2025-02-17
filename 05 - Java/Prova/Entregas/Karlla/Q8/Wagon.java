public class Wagon
{
  public TrainContent content;
  public Wagon nextWagon;
  public Wagon previousWagon;
  public Wagon(TrainContent content) 
  {
    this.content = content;
  }
}