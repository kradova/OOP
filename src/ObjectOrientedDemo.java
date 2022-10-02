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
        ArrayMethodDemo amd = new ArrayMethodDemo();

        int[] myArray = {1, 2, 3, 4, 5};
        amd.printFirstElement(myArray);

        int[] myArray2 = amd.returnArray();
        System.out.println(Arrays.toString(myArray2));
    }// main
}//ObjectOrientedDemo


