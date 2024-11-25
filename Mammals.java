public class Mammals extends Animal{
    public boolean isNocturn = true;

    public Mammals (String name, Integer age, boolean isNocturn){
       this.name = name;
       this.age = age;
       this.isNocturn = true;

    }
@Override
    public String toString(){
        return "Mammal name is " + name + " has " + age + " years,and is " + true;
    }

}
