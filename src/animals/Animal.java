package animals;

public class Animal {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void go(){
        System.out.println("Animal go");
    }

}//class Animal


