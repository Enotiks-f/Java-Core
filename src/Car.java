public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        serviceWheels();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println(" -Проверяем двигатель");
    }
}