package oldClassWorkAnimal;

public abstract class Animal implements Comparable<Animal> {

    public static int countAnimal;
    private int age;
    private String name;
    private int weight;


    public  Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }
    public Animal() {
    }


    public String info() {
        return "Имя " + name + " " + "лет: " + age + " " + "Вес: " + weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String toString() {
        return this.info();
    }

    public static void classDog() {
        System.out.println("Класс животные" + " " + "Количетсво животных" + countAnimal);
    }

    @Override
    public int compareTo(Animal o) {
        return getName().compareTo(o.getName());
    }
}

