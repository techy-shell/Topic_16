package Topic_16;

public class Mealtimes extends Cattery{
    private boolean breakfast;
    private boolean lunch; // if overweight, doesn't get lunch
    private boolean dinner;


    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public boolean isLunch() {
        return lunch;
    }

    public void setLunch(boolean lunch) {
        this.lunch = lunch;
    }

    public boolean isDinner() {
        return dinner;
    }

    public void setDinner(boolean dinner) {
        this.dinner = dinner;
    }

    //use joda time to code 3 meal times

    public static void meal1(){
        System.out.println("All cats fed breakfast at 7am");

    }
    public static void meal2(){
        System.out.println("All non overweight cats fed lunch at 12pm");
    }

    public static void meal3(){
        System.out.println("All cats fed dinner at 5pm");
    }
}
