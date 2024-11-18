public class Main {
    public static void main(String[] args) {
        Animal system = new Animal();

        Animal animal1 = new Bird("Coco", 12, 135);
        Animal animal2 = new Mammals("Bizu", 32, true);
        Animal animal3 = new Bird("Kiki", 3, 62);
        Animal animal4 = new Mammals("Zgarciu",28,false);
        System.out.println("----------------------------------");

        Animal.addAnimal(animal1);
    }
}
