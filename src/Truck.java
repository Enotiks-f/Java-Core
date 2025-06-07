public class Truck implements Serviceable {
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    private String modelName;
    private int wheelsCount;

    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println(" -Меняем покрышку");
        }
        System.out.println(" -Проверяем двигатель");
        System.out.println(" -Проверяем прицеп");
    }

}
