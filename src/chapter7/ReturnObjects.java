package chapter7;

public class ReturnObjects {
    int test;

    ReturnObjects (int i) {
        test = i;
    }

    ReturnObjects incrByTen() {
        ReturnObjects temp = new ReturnObjects(test + 10);
        return temp;
    }
}

class RetObject {
    public static void main(String[] args) {
        ReturnObjects object1 = new ReturnObjects(2);
        ReturnObjects object2;

        object2 = object1.incrByTen();
        System.out.println("object1.test: " + object1.test);
        System.out.println("object2.test: " + object2.test);

        object2 = object2.incrByTen();
        System.out.println("object2.test после второго увеличения: " + object2.test);
    }
}