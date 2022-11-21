package Topic_16;

public class Cattery {
    private static Cattery cattery = null;
    public String s;
    Cattery(){
        s = "Activity 4 - refactoring my Cattery class to make it singleton";
    }
    public static Cattery getInstance(){
        if (cattery == null){
            cattery = new Cattery();
        }
        return cattery;
    }
}


