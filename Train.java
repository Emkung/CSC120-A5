import java.util.ArrayList;
/*
 * a class used by the datas regarding trains 
 */
public class Train {
  private final Engine engine;
  private ArrayList < Car > cars;
  private int nCars;

  /*
   * constructor 
   * @param fuelType- the type of fuel used by the train
   * @param fuelCapacity- the maximum amount of fuel that could be used by trains 
   * @param nCar- the number of cars 
   * @param passengerCapacity- the maximum amount passenger allowed on the train 
   */
  public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
    this.engine = new Engine(fuelType, fuelCapacity);
    this.nCars = nCars;
    //System.out.print(this.cars);
    this.cars = new ArrayList<Car>();
    for (int i = 0; i < nCars; i++) {
      this.cars.add(new Car(passengerCapacity));
    }
  }
  /*
   * Accessor of engine 
   * @return engine- newly made engine class for a train 
   */
  public Engine getEngine() {
    return this.engine;
  }
  /*
   * Accessor of car 
   * @param i- index of the car
   * @return the car with the index count 
   */
  public Car getCar(int i) {
    return this.cars.get(i - 1);
  }
  /*
   * Accessor for allcapacity 
   * @return allcapacity
   */
  public int getMaxCapacity() {
    int allcapacity = 0;
    for (int j = 0; j < nCars; j++) {
      int carcapacity = this.getCar(j).getCapacity();
      allcapacity += carcapacity;

    }
    return allcapacity;
  }
  /*
   * shows the seats remaining in the Train 
   * @return allSeatsRemaining- all the seats remaining of all the cars
   */
  public int seatsRemaining() {
    int allSeatremaining = 0;
    for (int x = 0; x < nCars; x++) {
      int carsSeatsRemaining = this.getCar(x).seatsRemaining();
      allSeatremaining += carsSeatsRemaining;
    }
    return allSeatremaining;
  }
  /*
   * print all the passenger in the Train 
   */
  public void printManifest() {
    if (cars.size() == 0) {
      System.out.println("No passenger on the train");
    } else {
      for (Car eachcar: cars) {
        eachcar.printManifest();
      }
    }
  }
  public static void main(String args[]){

    Train myTrain= new Train(FuelType.STEAM, 20, 20, 20);
    myTrain.printManifest();
  }
}