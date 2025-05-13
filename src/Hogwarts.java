public class Hogwarts {
    private String name; // Имя
    private String surname; // Фамилия
    private int magic; // Магия
    private int transgress; // трансгрессии

    public Hogwarts(int magic, int transgress, String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgress = transgress;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void showProperties() {
        System.out.println("Имя: " + name +
                ", Фамилия: " + surname +
                ", Магия: " + magic +
                ", трансгрессия " + transgress);
    }
}
