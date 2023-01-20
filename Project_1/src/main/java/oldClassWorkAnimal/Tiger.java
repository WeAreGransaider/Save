package oldClassWorkAnimal;


import java.util.Objects;

public class Tiger extends Cat {

    private static int countTiger;
    private int Hunt;

    {
        countTiger++;
    }

    static {
        countTiger = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tiger tiger)) return false;
        if (!super.equals(o)) return false;
        return getHunt() == tiger.getHunt();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHunt());
    }

    public Tiger(int age, String name, int weight) {
        super(age, name, weight);
        this.Hunt = Hunt;
    }

    public Tiger(int age, String name) {
        super(age, name);
        this.Hunt = Hunt;
    }

    public Tiger() {
    }

    @Override
    public String info() {
        return super.info() + "Колчисетво охот: " + Hunt;
    }

    public int getHunt() {
        return Hunt;
    }

    public int setHunt(int Hunt) {
        return this.Hunt = Hunt;
    }

    @Override
    public String toString() {
        return this.info();
    }

    public String actionHunt() {
        return "Разорвать добычу!";
    }

    public static void classinfo() {
        System.out.println("Класс Тигр" + " " + "Количество тигров " + countTiger);
    }

}
