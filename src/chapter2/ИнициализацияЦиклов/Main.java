package chapter2.ИнициализацияЦиклов;

public class Main {

    public static void main(String[] args) {

        for (int x = 0; x < 10; x++) System.out.println("Значение x: " + x);

        // с использованием блока кода:

        int a, b;
        b = 20;

        for (a = 0; a < 10; a++){
            System.out.println("Значение a: " + a);
            System.out.println("Значение b: " + b);
            b -= 2;
        }
    }
}
