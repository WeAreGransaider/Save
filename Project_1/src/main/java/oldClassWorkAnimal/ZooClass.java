package oldClassWorkAnimal;

import java.util.*;

public class ZooClass {
    public static void main(String[] args) {
        Animal zooPark[] = new Animal[4];

        Dog newDog = new Dog(12, "Бобик", 42);
        Pig newPig = new Pig(5, "№3", 40, 0);
        Cow newCow = new Cow(21, "Аленка", 100);
        Cat newCat = new Cat(12, "Мурка", 10);
        zooPark[0] = newDog;
        zooPark[1] = newPig;
        zooPark[2] = newCow;
        zooPark[3] = newCat;
        for (int a = 0; a < 4; a++) {
            System.out.println(zooPark[a].toString());
        }
//        System.out.println(newDog.commandFas());
//        newDog.setName("Боб");
//        newDog.setAge(8);
//        System.out.println(newDog.info());
//        System.out.println(newPig.info());
//        System.out.println(newCat.action());
//        newDog.setTeeth(41);
//        System.out.println(newDog.toString());
//        System.out.println(newDog.getClass());
//        System.out.println(newDog.getClass().getName());
        Wolf.classInfo();
        Wolf wolf1 = new Wolf();
        System.out.println(wolf1.getTeeth());
        System.out.println(Wolf.getCountWolf());
        wolf1.printable();

        /*1.  создать TreeSet и реализовать сортировку name->age->weight
        2.  у всех зверей реализовать методы hashCode и equals
        3.  создать HashSet - добавить зверинец
        4.  преобразовать HashSet  в ArrayList*/

        Comparator<Animal> wolfComparator = new CompWolfName().thenComparing(new CompWolfAge()).thenComparing(new CompWolfWeight());
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.addAll(List.of(zooPark));
        zoo.sort(wolfComparator);
        for (Animal i : zoo) {
            System.out.println(i.toString());
        }
        HashSet<Animal> zPark = new HashSet<>();
        zPark.addAll(List.of(zooPark));
        ArrayList<Animal> zPark2 = new ArrayList<>(zPark);


        HashMap<String, Animal> zooMap = new HashMap<>();
        zooMap.put("Волк", wolf1);
        zooMap.put("Кошка", newCat);
        zooMap.put("Собака", newDog);
        zooMap.put("Свинья", newPig);

        HashMap<String,Integer> moreKey = new HashMap<>();
        moreKey.put("Ячейка 1",50);
        moreKey.put("Ячейка 2",41);
        moreKey.put("Ячейка 3",78);
        moreKey.put("Ячейка 4",54);

        ArrayList<Integer> value = new ArrayList<>(moreKey.values());
        Integer buffer = value.get(0);
        for(Integer i: value) {
            if (buffer < i) {
                buffer = i;
            }
        }
        System.out.println(buffer);

        for(Map.Entry <String,Integer> o: moreKey.entrySet()) {
            if (o.getValue() == buffer) {
                System.out.println(o.getKey());
                break;
            }
        }


    }
}
