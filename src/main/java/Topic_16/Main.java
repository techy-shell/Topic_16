package Topic_16;

public class Main {
    public static void main(String[] args) {
        Cattery cattery = Cattery.getInstance();
        System.out.println(cattery.s);
        Cats.catsList();
        System.out.println(" ");
        AFD.meal1();
        AFD.meal2();
        AFD.meal3();
    }
}