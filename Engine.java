
/*
 * a class that is used for the data 
 */
public class Engine {
    private FuelType f;
    private double current_fuel_level;
    private double max_fuel_level;
    /*
     * constructor 
     * @param f- the type of fuel of the engine
     * @param max_fuel_level- the maximum fuel level of the the engine
     */
    public Engine(FuelType f, double max_fuel_level) {
      this.f = f;
      this.current_fuel_level = max_fuel_level;
      this.max_fuel_level = max_fuel_level;
    }
    /*
     *  the current fuel level to the max fuel level
     */
    public void refuel() {
      this.current_fuel_level = this.max_fuel_level;
    }
    /*
     * decreases the fuel by one as long as current fuel level is greater than 0 and throws an exception when reaches 0
     */
    public void go() {
      if (this.current_fuel_level > 0) {
        this.current_fuel_level--;
        System.out.println("Remaining fuel level: " + this.current_fuel_level);
      } else {
        throw new RuntimeException("out of fuel");
      }
    }
    // public static void main(String[] args) {
    //   Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    //   try {
    //     while (true) {
    //       myEngine.go();
    //     }
    //   } catch (Exception e) {
    //     System.err.println(e.getMessage()); // Out of fuel
    //   }
    // }
  
  }