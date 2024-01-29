package chapter9.ModifAccess.p2;

import chapter9.ModifAccess.p1.Protection;

public class Protection2 extends Protection {
    Protection2 () {
        System.out.println("Конструктор производного класса из другого пакета");
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
