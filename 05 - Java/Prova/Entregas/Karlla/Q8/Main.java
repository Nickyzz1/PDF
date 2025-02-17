class Main 
{
  public static void main(String[] args) 
  {
    Train train = new Train();
    train.addWagon(TrainContent.FUEL);
    train.addWagon(TrainContent.EMPTY);
    train.addWagon(TrainContent.ANIMALS);
    train.addWagon(TrainContent.ANIMALS);
    train.addWagon(TrainContent.ANIMALS);
    train.addWagon(TrainContent.WHEAT);
    train.addWagon(TrainContent.WHEAT);
    train.addWagon(TrainContent.WHEAT);
    train.addWagon(TrainContent.FUEL);
    train.addWagon(TrainContent.FUEL);
    train.addWagon(TrainContent.EMPTY);
    train.addWagon(TrainContent.PASSENGERS);
    train.addWagon(TrainContent.PASSENGERS);
    train.addWagon(TrainContent.PASSENGERS);
    train.addWagon(TrainContent.PASSENGERS);
    System.out.println(train.count(TrainContent.FUEL));
    System.out.println(train.count(TrainContent.WHEAT));
    System.out.println(train.count(TrainContent.EMPTY));
    System.out.println(train.count(TrainContent.ANIMALS));
    System.out.println(train.count(TrainContent.PASSENGERS));
  }
}