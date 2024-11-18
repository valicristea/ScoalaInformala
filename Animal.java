public class Animal {
    public String name;
    public Integer age;

    public void addAnimal ( Animal animal1) {
        if (animal1 =! null ){
            animals.add(animal1);
            System.out.println("Added animal1!");
        }
    }
}
