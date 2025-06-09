public class Truck extends Vehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        serviceWheels();
        checkEngine();
        checkTrailer();
    }

    private void checkEngine() {
        System.out.println(" -Проверяем двигатель");
    }

    private void checkTrailer() {
        System.out.println(" -Проверяем прицеп");
    }
}