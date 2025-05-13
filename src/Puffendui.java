public class Puffendui extends Hogwarts {
    private int industrious;
    private int fidelity;
    private int honest;

    public int getIndustrious() {
        return industrious;
    }

    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }

    public int getFidelity() {
        return fidelity;
    }

    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public Puffendui(String name, String surname, int magic, int transgress, int industrious, int fidelity, int honest) {
        super(magic, transgress, name, surname);
        this.industrious = industrious;
        this.fidelity = fidelity;
        this.honest = honest;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("Трудолюбив: " + industrious +
                ", Верен: " + fidelity +
                ", Честен: " + honest
        );
    }
}
