public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int courage;

    public Gryffindor(String name, String surname, int magic, int transgress,  int nobility, int honour, int courage) {
        super(magic, transgress, name, surname);
        this.nobility = nobility;
        this.honour = honour;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println( "Благородство: " + nobility +
                ", Честь: " + honour +
                ", храбрость: " + courage
        );
    }

}
