package Topic_16;

public class Cats {
    private String name;
    private String breed;
    private int age;
    private boolean isOverweight;
    private String food;

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
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public boolean isOverweight() {
        return isOverweight;
    }

    public void setOverweight(boolean overweight) {
        isOverweight = overweight;
    }

    public Cats(String name, String breed, int age, boolean isOverweight, String food) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isOverweight = isOverweight;
        this.food = food;


    }

}
