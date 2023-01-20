package oldClassWorkAnimal;

import java.util.Objects;

public class Hog extends Animal {

    private static int countHog;
    private int sizeFang;

    {
        countHog++;
    }

    static {
        countHog = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hog hog)) return false;
        return getSizeFang() == hog.getSizeFang();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSizeFang());
    }

    public Hog(int age, String name, int weight, int sizeFang) {
        super(age, name, weight);
        this.sizeFang = sizeFang;
    }

    public Hog(int age, String name) {
        super(age, name);
        this.sizeFang = sizeFang;
    }

    public Hog(String name) {
        super(name);
    }

    public Hog() {
    }

    @Override
    public String info() {
        return super.info() + "Размер клыков: " + sizeFang;
    }

    public int getSizeFang() {
        return sizeFang;
    }

    public int setSizeFang(int sizeFang) {
        return this.sizeFang = sizeFang;
    }

    public String attack() {
        return "Быднуть";
    }

    @Override
    public String toString() {
        return this.info();
    }

    public static void classPig() {
        System.out.println("Класс кабан" + " " + "Количество кабанов" + countHog);
    }
}

