public class CarMain {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("Toyota", "Corolla", 2020, 30.5, 5000, 14, 7),
            new Car("Honda", "Civic", 2021, 32.0, 8000, 12, 6),
            new Car("Ford", "Mustang", 2018, 20.0, 12000, 16, 10),
            new Car("Chevrolet", "Malibu", 2019, 28.5, 7000, 15, 5),
            new Car("Nissan", "Altima", 2022, 31.0, 4000, 13, 8)
        }; // Creates five new car objects and assigns them values.
        for (int x=0; x<cars.length; x++) {
            System.out.println(cars[x]);
            System.out.println(cars[x].getFuelRemaining()+" gallons remaining.");
            cars[x].drive(5);
        }
    } // Tests drive method by using all 5 objects. Adds 5 miles to the odometer if there is enough gas, otherwise it states that there is not enough gas.
}
