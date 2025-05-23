public class Bicycle implements Serviceable {
    private String modelName;
    private int wheelsCount;

    @Override
    public void service() {
        System.out.println("Обслуживаем велосипед:");
        System.out.println(" -Меняем покрышку")
    }

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
}
