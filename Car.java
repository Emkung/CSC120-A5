import java.util.ArrayList;

import javax.management.RuntimeErrorException;
public class Car {
    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity; 

    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
    }
    public int getCapacity(){
        return this.maxCapacity;
    }
    public int seatsRemaining(){
        return this.maxCapacity - this.passengersOnboard.size();
    }
    public void addPassenger(Passenger p){
        if (this.passengersOnboard.contains(p)){
            throw new RuntimeException("Passenger already on board.");
        }if (seatsRemaining() <= 0){
            throw new RuntimeException("Already at max capacity");
        }else{
            this.passengersOnboard.add(p);
            System.out.println(p + "was successfully added ");
        }
    }
    public void removePassenger(Passenger p){
        if (!this.passengersOnboard.contains(p)){
           throw new RuntimeException(p+ "not on board.");
        }if(this.passengersOnboard.size()<= 0){
            throw new RuntimeException("Cannot remove anymore passengers");
        }else{
            this.passengersOnboard.remove(p);
            System.out.println(p + "was successfully removed ");
        }
    }
    public void printManifest(){
        if (this.passengersOnboard.size() == 0){
            System.out.println("No passenger on the train.");
        }else{
            for (Passenger name: this.passengersOnboard){
                System.out.println(name);
            }
        }
        
    }

}