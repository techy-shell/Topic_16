package Topic_16;

import java.util.ArrayList;

public class Cattery {

    public boolean isFull;

    public boolean isFull() {
        return isFull();
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public static void main(String[] args) {

        Cats cat1 = new Cats("Dotty", "Shorthair", 2, false, "tuna");
        Cats cat2 = new Cats("Spotty", "Bengal", 11, true, "dry");
        Cats cat3 = new Cats("Lotty", "Maine Coon", 1, false, "wet");
        Cats cat4 = new Cats("Molly", "Ragdoll", 7, true, "tuna");
        Cats cat5 = new Cats("Mittens", "Shorthair", 3, false, "dry");
        Cats cat6 = new Cats("Spots", "Bengal", 15, false, "wet");
        Cats cat7 = new Cats("Tom", "Maine Coon", 4, true, "tuna");
        Cats cat8 = new Cats("Fred", "Ragdoll", 7, false, "dry");

        ArrayList<Cats> catsInCattery = new ArrayList<>();
        catsInCattery.add(cat1);
        catsInCattery.add(cat2);
        catsInCattery.add(cat3);
        catsInCattery.add(cat4);
        catsInCattery.add(cat5);
        catsInCattery.add(cat6);
        catsInCattery.add(cat7);
        catsInCattery.add(cat8);
        System.out.println("List of cats currently in the cattery - ");
        for (Cats cats : catsInCattery) {
            System.out.println("Name : " + cats.getName());
            System.out.println("Age : " + cats.getAge());
            System.out.println("Breed : " + cats.getBreed());
            System.out.println("Favourite food : " + cats.getFood());
            System.out.println("Overweight : " + cats.isOverweight());
            if (cats.isOverweight() == true) {
                System.out.println(cats.getName() + " is overweight so will not be fed lunch");
            }
            System.out.println(" ");
        }
            if (catsInCattery.size() > 10) {
                System.out.println("No more room in the cattery!");
            } else {
                System.out.println("Spaces left in cattery - " + (10 - catsInCattery.size()));
            }
        System.out.println(" ");
        Mealtimes.meal1();
        Mealtimes.meal2();
        Mealtimes.meal3();
    }
}


