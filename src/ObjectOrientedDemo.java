import animals.Animal;
import animals.Dog;
import animals.Cat;

import java.util.Arrays;

public class ObjectOrientedDemo {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
////        Staff a = new Staff();
////        a.setHoursWorked(10);
////
////        System.out.println(a.getHoursWorked());
//
//
//        Cat cat_1 = new Cat();
//        System.out.println(cat_1.getName());
//
//        cat_1.setName("Archi");
//        System.out.println(cat_1.getName());
//
//        Cat cat_2 = new Cat("Leva", 7);
//        System.out.println("Name: " + cat_2.getName() +
//                "; Age: " + cat_2.getAge());
//
//        Staff staff1 = new Staff("Peter");
//        staff1.setHoursWorked(160);
//        int pay = staff1.calculatePay(1000, 400);
//        System.out.println("Pay = " + pay);
//
//        Staff staff2 = new Staff("Jane", "Lee");
//        staff2.setHoursWorked(160);
//        pay = staff2.calculatePay();
//        System.out.println("Pay = " + pay);
//
//        System.out.println("\n\nUpdating Jane's Hours Worked to - 10");
//        staff2.setHoursWorked(-10);
//        System.out.println("\nHours Worked = " + staff2.getHoursWorked());
//        pay = staff2.calculatePay();
//        System.out.println("Pay = " + pay);
        //Static methods
//        StaticDemo sd = new StaticDemo();
//        System.out.println(sd.message);
//        sd.displayMessage();
//
//        System.out.println(StaticDemo.greetings);
//        StaticDemo.displayGreetings();

//Arrays

//        ArrayMethodDemo amd = new ArrayMethodDemo();
//
//        int[] myArray = {1, 2, 3, 4, 5};
//        amd.printFirstElement(myArray);
//
//        int[] myArray2 = amd.returnArray();
//        System.out.println(Arrays.toString(myArray2));
//
//        int number = 2;
//        System.out.println("number before = " + number);
//        amd.passPrimitive(number);
//        System.out.println("number after = " + number);
//        System.out.print("\n");
//
//        System.out.println("myArray[1] before = " + myArray[1]);
//        amd.passReference(myArray);
//        System.out.println("myArray[1] after = " + myArray[1]);

        Animal it = new Animal("Animal", 3);
        System.out.println(it.getName());
        System.out.println(it.getAge());
        it.go();

        Dog viva = new Dog("Viva", 12);
        System.out.println(viva.getName());
        System.out.println(viva.getAge());
        viva.go(viva.getName());

        Cat archi = new Cat("Archi", 7);
        System.out.println(archi.getName());
        System.out.println(archi.getAge());
        archi.go(archi.getName());

        animalGo(viva);
        animalGo(archi);
    }// main
    public static void animalGo(Animal animal){
        animal.go();
    }
}//ObjectOrientedDemo


