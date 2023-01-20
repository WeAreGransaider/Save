package oldClassWorkAnimal;

import java.util.Objects;

public class Cow extends Animal {

    private static int countCow;
    private int milk;

    {
        countCow++;
    }

    static {
        countCow = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cow cow)) return false;
        return getMilk() == cow.getMilk();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMilk());
    }

    public Cow(int age, String name, int weight) {
        super(age, name, weight);
        this.milk = milk;
    }

    public Cow(int age, String name) {
        super(age, name);
    }

    public Cow(String name) {
        super(name);
    }

    public Cow() {
    }

    @Override
    public String info() {
        return super.info() + "Литров молока за удой " + milk;
    }

    public String sound() {
        return "Muy";
    }

    public int getMilk() {
        return milk;
    }

    public int setMilk(int milk) {
        return this.milk = milk;
    }

    @Override
    public String toString() {
        return this.info();
    }

    public static void classDog() {
        System.out.println("Класс корова" + " " + "Количетсво коров" + countCow);
    }
}
