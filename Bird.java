public class Bird extends Animal {
    public Integer wingspan;

    public Bird (String name, Integer age, Integer wingspan){
        this.name = name;
        this.age = age;
        this.wingspan = wingspan;
    }

@Override
    public String toString(){
    return "Bird name is " + name + " has " + age + " years,and has " + wingspan + " cm.";
    }
}
