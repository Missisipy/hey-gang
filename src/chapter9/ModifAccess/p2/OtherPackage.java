package chapter9.ModifAccess.p2;

import chapter9.ModifAccess.p1.Protection;

public class OtherPackage {
    OtherPackage () {
        Protection p = new Protection();
        System.out.println("Конструктор класса из другого пакета");
        System.out.println("n_pub = " + p.n_pub);
    }

}
