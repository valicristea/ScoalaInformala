import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Added animal " + animal.name);
    }
    public void deleteAnimal (String name) {
        animals.removeIf (animal -> animal.name == name);

    }
    public void listAnimals (){
        animals.forEach(animal -> {
            System.out.println(animal.toString());
        });
    }
}