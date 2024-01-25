package chapter7;

public class Static {

    static int a = 42;
    private static int b = 99;

    static int callNumber() {
        int i = b;
        return i;
    }
    static void callMe() {
        System.out.println("a = " + a);
    }
}

class StaticByName {
    public static void main(String[] args) {
        Static.callMe();
        System.out.println("b = " + Static.callNumber());
    }
}