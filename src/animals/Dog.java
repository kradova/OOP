package animals;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void go(String name){
        System.out.println(name + " go");
    }

}//class Dog
