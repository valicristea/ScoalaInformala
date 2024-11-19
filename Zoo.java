public class Zoo {
    Animal animal1;
    Animal animal2;
    Animal animal3;
    Animal animal4;

    public void addAnimal (Animal animal){
        if (animal1 == null){
            this.animal1 = animal1;
            System.out.println("Added animal1!");
            return;
        }

        if (animal2 == null){
            this.animal2 = animal2;
            System.out.println("Added animal2!");
            return;
        }

        if (animal3 == null){
            this.animal3 = animal3;
            System.out.println("Added animal3!");
            return;
        }

        if (animal4 == null){
            this.animal4 = animal4;
            System.out.println("Added animal4!");
            return;
        }
        System.out.println("Zoo is full!!!");
    }
}
