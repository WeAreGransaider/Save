package oldClassWorkAnimal;

import java.util.Objects;

public class Pig extends Hog {
    private static int countPig;
    private int fatWeight;


    {
        countPig++;
    }

    static {
        countPig = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pig pig)) return false;
        if (!super.equals(o)) return false;
        return getFatWeight() == pig.getFatWeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFatWeight());
    }

    public Pig(int age, String name, int weight, int sizeFang) {
        super(age, name, weight, sizeFang);
        this.fatWeight = fatWeight;
    }

    public Pig(int age, String name) {
        super(age,name);
    }


    public Pig() {
    }

    @Override
    public String info() {
        return super.info() + "количества жира: " + fatWeight;
    }

    public String action() {
        return "Воляться в грязи";
    }

    public int getFatWeight() {
        return fatWeight;
    }

    public int setFatWeight( int fatWeight) {
        return this.fatWeight = fatWeight;
    }

    @Override
    public String toString() {
        return this.info();
    }

    public static void classPig() {
        System.out.println("Коасс свинья" + " " + "Количество свиней" + countPig);
    }

}
