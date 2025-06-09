public class Main {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();

        station.check(new Car("car1", 4));
        station.check(new Car("car2", 4));
        station.check(new Bicycle("bicycle1", 2));
        station.check(new Bicycle("bicycle2", 2));
        station.check(new Truck("truck1", 6));
        station.check(new Truck("truck2", 8));
    }
}