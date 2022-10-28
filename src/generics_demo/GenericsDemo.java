package generics_demo;

public class GenericsDemo {
    public static void main(String[] args) {
        MyGenericsClass g = new MyGenericsClass();
//        g.setMyVar("Java");
        g.setMyVar(5);
        g.printValue();
    }//main
}

class MyGenericsClass<T extends Number> {
    private T myVar;

    void setMyVar(T i) {
        myVar = i;
    }

    void printValue() {
        System.out.println("The value of myVar is " + myVar);
    }
}//GenericsDemo
