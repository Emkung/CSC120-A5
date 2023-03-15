import java.util.ArrayList;
import java.util.jar.Attributes.Name;

/*
 * this class is meant for the datas regarding the cars
 */
public class Car {
  private ArrayList < Passenger > passengersOnboard;
  private int maxCapacity;
  /*
   * constructor
   * @param maxCapacity- integer for the initial max capacity of individual cars
   */
  public Car(int maxCapacity) {
    this.maxCapacity = maxCapacity;
    this.passengersOnboard = new ArrayList < Passenger > (maxCapacity);
  }
  /*
   * accessor for maxCapacity 
   * @return maxCapacity- integer for the initial max capacity of individual cars
   */
  public int getCapacity() {
    return this.maxCapacity;
  }
  /*
   * a method that shows the seats remaining in the individual cars by substracting the number of passanger on board from the max capacity
   * @return the total seat remaining
   */
  public int seatsRemaining() {
    return this.maxCapacity - this.passengersOnboard.size();
  }
  /*
   * a method that adds passenger into the car and will throw exceptions if passenger cannot be added 
   * @param p- the new passengers to be added into the car
   */
  public void addPassenger(Passenger p) {
    if (this.passengersOnboard.contains(p)) {
      throw new RuntimeException("Passenger already on board.");
    }
    if (seatsRemaining() <= 0) {
      throw new RuntimeException("Already at max capacity");
    } else {
      this.passengersOnboard.add(p);
      System.out.println("Passenger was successfully added ");
    }
  }
  /*
   * a method that removes passenger into the car and if there isn't such passenger on board it will throw an exception
   * @param p- the new passengers to be removed from the car
   */
  public void removePassenger(Passenger p) {
    if (!this.passengersOnboard.contains(p)) {
      throw new RuntimeException("Passenger not on board.");
    } else {
      this.passengersOnboard.remove(p);
      System.out.println("Passenger was successfully removed ");
    }
  }
  /*
   * a method that prints out all the passengers on the train and if there is none it will throw an exception
   */
  public void printManifest() {
    if (this.passengersOnboard.size() == 0) {
      System.out.println("No passenger on the train.");
    } else {
      for (Passenger name: this.passengersOnboard) {
        System.out.println(name.getName());
      }
    }

  }
//   public static void main(String args[]){
//     Car myCar = new Car(20);
//     Passenger myPassenger = new Passenger("ligma");
//     myCar.addPassenger(myPassenger);
//     myCar.printManifest();
//   }

}