package modifier_demo;

public class ClassB {
    public void printMessages() {
        ModiferDemo p = new ModiferDemo();

        // Разрешено
        System.out.println(p.publicNum);
        // Разрешено
        System.out.println(p.protectedNum);
        // Разрешено
        System.out.println(p.packagePrivateNum);
        // НЕ разрешено!
        System.out.println(p.privateNum);
    }
}//ClassB
