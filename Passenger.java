/*
 * a class that is used by the data regarding passengers
 */
public class Passenger {

    private String name;
    /*
     * constructor 
     * @param name- name of the passenger
     */
    public Passenger(String name) {
      this.name = name;
    }
    /*
     * a method used to add passenger into a car and if it catches exception it will send out a message
     * @param c- individual cars
     */
    public void boardCar(Car c) {
      try {
        c.addPassenger(this);
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
    }
    /*
     * a method used to remove passenger from the car, if met with an exception it will send a message
     * @param c- individual cars
     */
    public void getOffCar(Car c) {
      try {
        c.removePassenger(this);
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
    }
    public String getName(){
        return this.name;
    }
    // public static void main(String args[]){
    //     Passenger myPassenger = new Passenger("James");
    //     Car myCar = new Car(20);
    //     myPassenger.boardCar(myCar);
    // }

  }