package interface_demo;

public class InterfaceDemo {
    public static void main(String[] args) {
        MyClass a = new MyClass();
        a.someMethod();

        System.out.println("The value of the constant is " + MyInterface.myInt);
    }
}
