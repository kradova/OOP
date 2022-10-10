package modifier_demo;

public class ClassA extends ModiferDemo {
    public void printMessages() {
        // Разрешено
        System.out.println(publicNum);
        // Разрешено
        System.out.println(protectedNum);
        // Разрешено
        System.out.println(packagePrivateNum);
        // НЕ разрешено!
        System.out.println(privateNum);
    }
}//ClassA
