public abstract class Vehicle implements Serviceable {
    protected String modelName;
    protected int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    protected void serviceWheels() {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println(" -Меняем покрышку");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}