package chapter7;

class Overload {
    public static void main(String[] args) {

        int i = 88;

        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(i);
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): " + result);
    }
}
