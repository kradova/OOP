package another_package;

import modifier_demo.ModiferDemo;

public class MyClassC extends ModiferDemo {
    // Разрешено
    System.out.println(publicNum);
    // Разрешено
    System.out.println(protectedNum);
    // НЕ разрешено!
    System.out.println(packagePrivateNum);
    // НЕ разрешено!
    System.out.println(privateNum);
}//MyClassC
