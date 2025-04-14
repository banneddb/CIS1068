class Car {
    String carMake;
    String carModel;
    int carYear;
    double MPG;
    double milesDriven;
    double gallonsCapacity;
    double gallonsRemaining;

   public Car(String make, String model, int year, double milespergallon, double odometer, double capacity, double gasLeft) {
        this.carMake = make;
        this.carModel = model;
        this.carYear = year;
        this.MPG = milespergallon;
        this.milesDriven = odometer;
        this.gallonsCapacity = capacity;
        this.gallonsRemaining = gasLeft;
   }
   public void drive(double driveMiles) {
        milesDriven += driveMiles;
        double gallonsUsed = driveMiles/MPG;
        if (gallonsUsed>gallonsRemaining) {
            System.out.println("Not enough gas is left! Put a valid number in.");
            milesDriven -= driveMiles;
        }
        else {
          gallonsRemaining -= gallonsUsed;
          System.out.println("You drove " + driveMiles + " miles");
          System.out.println("Updated Odometer:" + milesDriven);
        }
   } 
   public void fillTank(double gallonsAdded) {
     gallonsRemaining+=gallonsAdded;
     if (gallonsRemaining>gallonsCapacity) {
          System.out.println("This exceeds the fuel capacity. Try a different number.");
          gallonsRemaining-=gallonsAdded;
     }
   }
   public double getFuelRemaining() {
     return gallonsRemaining;
   }
   public String toString() {
     return
     carMake + ", " +
     carModel + ", " +
     carYear + ", " +
     MPG + ", " +
     milesDriven + ", "+
     gallonsCapacity + ", " +
     gallonsRemaining;
}
}