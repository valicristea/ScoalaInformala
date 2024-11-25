public class Main {
    public static void main(String[] args) {
        Zoo system = new Zoo();

        Animal animal1 = new Bird("Coco", 12, 135);
        Animal animal2 = new Mammals("Bizu", 32, true);
        Animal animal3 = new Bird("Kiki", 3, 62);
        Animal animal4 = new Mammals("Zgarciu",28,false);
        System.out.println("----------------------------------");

        system.addAnimal(animal1);
        system.addAnimal(animal2);
        system.addAnimal(animal3);
        system.addAnimal(animal4);
        system.listAnimals();
        System.out.println("----------------------------");
        system.deleteAnimal("Coco");
        system.listAnimals();
    }
}
