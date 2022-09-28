public class ObjectOrientedDemo {


    public static void main(String[] args) {
        System.out.println("Hello World!");

        Staff a = new Staff();
        a.setHoursWorked(10);

        System.out.println(a.getHoursWorked());


        Cat cat_1 = new Cat();
        System.out.println(cat_1.getName());

        cat_1.setName("Archi");
        System.out.println(cat_1.getName());

        Cat cat_2 = new Cat("Leva", 7);
        System.out.println("Name: " + cat_2.getName() +
                "; Age: " + cat_2.getAge());
    }// main
}

