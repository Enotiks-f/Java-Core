package hm_oop1;

public class Cogteuran extends Hogwarts{
    private int clever; // Ум
    private int mudras; // Мудрость
    private int witty; // Остроумие

   public Cogteuran(String name, String surname, int magic, int transgress, int clever, int mudras, int witty) {
       super(magic, transgress, name, surname);
       this.clever = clever;
       this.mudras = mudras;
       this.witty = witty;
   }

    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getMudras() {
        return mudras;
    }

    public void setMudras(int mudras) {
        this.mudras = mudras;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void showProperties() {
        super.showProperties();
        System.out.println("ум: " + clever +
                ", Мудрость: " + mudras +
                ", Остроумие: " + witty
        );
    }


}
