package Topic_16;

import java.util.ArrayList;

public class Cats {
    private String name;
    private String breed;
    private int age;
    private boolean isOverweight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOverweight() {
        return isOverweight;
    }

    public void setOverweight(boolean overweight) {
        isOverweight = overweight;
    }

    //code arraylist of cats & their details & print list

    public Cats(String name, String breed, int age, boolean isOverweight){
       this.name = name;
       this.breed = breed;
       this.age = age;
       this.isOverweight = isOverweight;
        Cats cat1 = new Cats("Dotty", "Shorthair", 2, false);
        Cats cat2 = new Cats("Spotty","Bengal", 11, true);
        Cats cat3 = new Cats("Lotty","Maine Coon", 1, false);
        Cats cat4 = new Cats("Molly","Ragdoll", 7, true);
        Cats cat5 = new Cats("Mittens", "Shorthair", 3, false);
        Cats cat6 = new Cats("Spots","Bengal", 15, false);
        Cats cat7 = new Cats("Tom","Maine Coon", 4, true);
        Cats cat8 = new Cats("Fred","Ragdoll", 7, false);

        ArrayList<Cats> catsInCattery = new ArrayList<>();
        catsInCattery.add(cat1);
        catsInCattery.add(cat2);
        catsInCattery.add(cat3);
        catsInCattery.add(cat4);
        catsInCattery.add(cat5);
        catsInCattery.add(cat6);
        catsInCattery.add(cat7);
        catsInCattery.add(cat8);

        for(Cats cats : catsInCattery) {
            System.out.println("The cats that are currently in the cattery are : " + cats.getName());
            System.out.println("Their ages are : " + cats.getAge());
            System.out.println("Their breeds are : " + cats.getBreed());
        }
    }


}
