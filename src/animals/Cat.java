package animals;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void go(String name){
        System.out.println(name + " go");
    }
}//class Cat
