package oldClassWorkAnimal;

import org.example.Print;

import java.util.Objects;

public class Wolf extends Animal implements Print {
    private static int countWolf;
    private int teeth;
    private int hearingRadius;

    {
        countWolf++;
    }

    static {
        countWolf = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wolf wolf)) return false;
        return getTeeth() == wolf.getTeeth() && getHearingRadius() == wolf.getHearingRadius();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTeeth(), getHearingRadius());
    }

    public Wolf(int age, String name, int weight) {
        super(age, name, weight);
        this.teeth = teeth;
        this.hearingRadius = hearingRadius;
    }

    public Wolf (String name) {
        super(name);
        this.teeth = teeth;
    }

    public Wolf(int age,String name) {
        super(age,name);
    }

    public Wolf() {
    }

    @Override
    public String info() {
        return super.info();
    }

    @Override
    public void print() {
        System.out.println(this.getName());
    }

    public static int getCountWolf() {
        return countWolf;
    }

    public int getTeeth() {
        setName("Шарик");
        return teeth;
    }

    public int setTeeth(int i) {
        return this.teeth = teeth;
    }

    public int getHearingRadius() {
        return hearingRadius;
    }

    public int setHearingRadius() {
        return this.hearingRadius = hearingRadius;
    }

    public String actionPack() {
        return "Собраться в стаю";
    }

    public String sound() {
        return "Лай";
    }

    public static void classInfo() {
        System.out.println("Класс Волк" + " " + "Количество волков" + countWolf);
    }


}
