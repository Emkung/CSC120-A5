import java.util.ArrayList;
public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;
    private int nCars;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        for (int i = 0; i< nCars; i++){
            this.cars.add(new Car(passengerCapacity));
        }
    }
    public Engine getEngine(){
        return this.engine;
    }
    public Car getCar(int i){
        return this.cars.get(i - 1);
    }
    public int getMaxCapacity(){
        int allcapacity = 0;
        for (int j = 0; j< nCars; j++){
            int carcapacity= this.getCar(j).getCapacity();
            allcapacity += carcapacity;

        }
        return allcapacity; 
    }
    public int seatsRemaining(){
        int allSeatremaining =0;
        for (int x = 0; x < nCars; x++){
            int carsSeatsRemaining = this.getCar(x).seatsRemaining();
            allSeatremaining += carsSeatsRemaining;
        }
        return allSeatremaining;
        }
    public void printManifest(){
        if (cars.size() == 0){
            System.out.println("No passenger on the train");
        }else{
            for (Car eachcar: cars){
                eachcar.printManifest();
            }
        }
    }
}
