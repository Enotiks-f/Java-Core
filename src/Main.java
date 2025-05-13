public class Main {
    public static void main(String[] args) {
        Gryffindor Harri = new Gryffindor("Harri", "Poter", 8, 2, 3, 5, 10);
        Gryffindor Hermiona = new Gryffindor("Hermiona", "Granger", 8, 4, 7, 9, 10);
        Gryffindor Ron = new Gryffindor("Ron", "Weasley", 2, 3, 4, 2, 10);

        Slytherin Draco = new Slytherin("Draco", "Malfoy", 8, 4 ,6, 4, 6, 7, 2);
        Slytherin Graham  = new Slytherin("Graham", "Montague", 2, 4, 3, 5, 6, 7, 8);
        Slytherin Gregory = new Slytherin("Gregory", "Goyle", 2, 6, 3, 6, 7 ,7, 8);

        Puffendui Zachary = new Puffendui("Zachaary", "Smith", 7, 6, 7, 9, 3);
        Puffendui Cedric = new Puffendui("Cedric", "Digory", 9, 5, 6, 8, 6);
        Puffendui Justin = new Puffendui("Jastin", "Finch-Fletchley", 8 ,5, 8, 9, 4);

        Cogteuran Zhou = new Cogteuran("Zhou", "Chang", 2, 5, 7, 8, 5);
        Cogteuran Padma = new Cogteuran("Padma", "Patil", 6, 7, 4, 3, 2);
        Cogteuran Marcus = new Cogteuran("Marcus", "Belby", 4, 6, 7, 3 ,7);

        System.out.println("\nГрифендор\n");
        Harri.showProperties();
        Hermiona.showProperties();
        Ron.showProperties();

        System.out.println("\nСлизерин\n");
        Draco.showProperties();
        Graham.showProperties();
        Gregory.showProperties();

        System.out.println("\nПуфендуй\n");
        Zachary.showProperties();
        Cedric.showProperties();
        Justin.showProperties();

        System.out.println("\nКогтевран\n");
        Zhou.showProperties();
        Padma.showProperties();
        Marcus.showProperties();

        System.out.println("\nЛучшие в Факультетах\n");

        bestGrifendors(Harri, Hermiona);
        bestSlytherin(Draco, Graham);
        bestCogteuran(Zhou, Padma);
        bestPuffendui(Zachary, Cedric);

        System.out.println("\nЛучший в Хогвартсе\n");
        bestHogwarts(Harri, Draco);

    }

    // ch - Character
    public static void bestGrifendors(Gryffindor ch1, Gryffindor ch2) {
        int pointCh1 = ch1.getCourage() + ch1.getNobility() + ch1.getHonour();
        int pointCh2 = ch2.getCourage() + ch2.getNobility() + ch2.getHonour();

        if (pointCh1 > pointCh2) {
            System.out.println(ch1.getName() + " лучший Грифендориц, чем " + ch2.getName());
        }else {
            System.out.println(ch2.getName() + " лучший Грифендориц, чем " + ch1.getName());
        }
    }

    // ch - Character
    public static void bestSlytherin(Slytherin ch1, Slytherin ch2) {
        int pointCh1 = ch1.getAmbition() + ch1.getCunning() + ch1.getDetermination() + ch1.getIngenuity() + ch1.getLustForPower();
        int pointCh2 = ch1.getAmbition() + ch1.getCunning() + ch1.getDetermination() + ch1.getIngenuity() + ch1.getLustForPower();

        if (pointCh1 > pointCh2) {
            System.out.println(ch1.getName() + " лучший Слизеринец, чем " + ch2.getName());
        }else {
            System.out.println(ch2.getName() + " лучший Слизеринец, чем " + ch1.getName());
        }
    }

    // ch - Character
    public static void bestPuffendui(Puffendui ch1, Puffendui ch2) {
        int pointCh1 = ch1.getFidelity() + ch1.getIndustrious() + ch1.getHonest();
        int pointCh2 = ch1.getFidelity() + ch1.getIndustrious() + ch1.getHonest();

        if (pointCh1 > pointCh2) {
            System.out.println(ch1.getName() + " лучший Пуфендуец, чем " + ch2.getName());
        }else {
            System.out.println(ch2.getName() + " лучший Пуфендуец, чем " + ch1.getName());
        }
    }

    // ch - Character
    public static void bestCogteuran(Cogteuran ch1, Cogteuran ch2) {
        int pointCh1 = ch1.getClever() + ch1.getMudras() + ch1.getWitty();
        int pointCh2 = ch1.getClever() + ch1.getMudras() + ch1.getWitty();

        if (pointCh1 > pointCh2) {
            System.out.println(ch1.getName() + " лучший Когтевранец, чем " + ch2.getName());
        }else {
            System.out.println(ch2.getName() + " лучший Когтевранец, чем " + ch1.getName());
        }
    }

    // ch - Character
    public static void bestHogwarts(Hogwarts ch1, Hogwarts ch2) {
        int pointCh1 = ch1.getMagic() + ch1.getTransgress();
        int pointCh2 = ch2.getMagic() + ch2.getTransgress();
        if (pointCh2 < pointCh1) {
            System.out.println(ch1.getName() + " Лучше чем " + ch2.getName());
        } else {
            System.out.println(ch2.getName() + " Лучше чем " + ch1.getName());
        }
    }



}
