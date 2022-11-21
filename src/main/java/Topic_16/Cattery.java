package Topic_16;

public class Cattery {
    private static Cattery single_instance = null;
    public String s;
    Cattery(){
        s = "Activity 4 - refactoring my Cattery class to make it singleton";
    }
    public static Cattery getInstance(){
        if (single_instance == null){
            single_instance = new Cattery();
        }
        return single_instance;
    }
}


