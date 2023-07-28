import java.util.ArrayList;

public class ArrayOfAnimals {
    ArrayList<String> animals;

    public ArrayOfAnimals() {
        animals = new ArrayList<String>();
    }

    public void addAnimal(String animal) {
        animals.add(animal);
    } 

    public void printAllAnimals() {
        System.out.println(animals);
    }
}
