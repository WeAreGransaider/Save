package oldClassWorkAnimal;

import java.util.Objects;

public class Dog extends Wolf {

    private static int countDog;
    private int dogLive;

    {
        countDog++;
    }

    static {
        countDog = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        if (!super.equals(o)) return false;
        return getDogLive() == dog.getDogLive();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDogLive());
    }

    public Dog(int age, String name, int weight) {
        super(age, name, weight);
    }

    public Dog(int age, String name) {
        super(age,name);
    }

    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }

    @Override
    public String info() {
        return super.info() + "Собачих лет: " + dogLive;
    }

    public String security() {
        return "Охранять территорию!";
    }

    public String commandFas() {
        return "Фас!";
    }


    public int getDogLive() {
        return dogLive;
    }

    public int setDogLive(int dogLive) {
        return this.dogLive = dogLive;
    }

    @Override
    public String toString() {
        return this.info();
    }

    public static void classDog() {
        System.out.println("Класс собака" + " " + "Количетсво собак" + countDog);
    }

}