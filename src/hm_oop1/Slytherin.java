package hm_oop1;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public Slytherin(String name, String surname, int magic, int transgress, int cunning, int determination, int ambition, int ingenuity, int lustForPower) {
        super(magic, transgress, name, surname);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.lustForPower = lustForPower;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("хитрость: " + cunning +
                ", решительность: " + determination +
                ", амбициозность: " + ambition +
                ", находчивость: " + ingenuity +
                ", жажда власти: " + lustForPower
        );
    }
}
