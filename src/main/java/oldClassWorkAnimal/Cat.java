package oldClassWorkAnimal;

import java.util.Objects;

public class Cat extends Animal {
    private static int countCat;
    private int catLife;

    {
        countCat++;
    }

    static {
        countCat = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return getCatLife() == cat.getCatLife();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCatLife());
    }

    public Cat(int age, String name, int weight) {
        super(age, name, weight);
        this.catLife = catLife;
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public String info() {
        return super.info() + "Кошачих лет: " + catLife;
    }

    public int getCatLife() {
        return catLife;
    }

    public int setCatLife(int catLife) {
        return this.catLife = catLife;
    }

    public String action() {
        return "Царапать диван";
    }

    public String sound() {
        return "Мяу";
    }

    @Override
    public String toString() {
        return this.info();
    }

    public static void classCat() {
        System.out.println("Класс кошка" + " " + "Количетсво кошка" + countCat);
    }
}