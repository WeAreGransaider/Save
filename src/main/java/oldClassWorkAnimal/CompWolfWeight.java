package oldClassWorkAnimal;

import oldClassWorkAnimal.Animal;

import java.util.Comparator;

public class CompWolfWeight implements Comparator <Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return (o1.getWeight()-o2.getWeight());
    }
}
