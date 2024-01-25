package chapter7;

public class DefaultArray {

    static void vaTest (String message, int ... v) {

        System.out.println(message + v.length + " Содержимое: ");

        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest("Один аргумент переменной длины: ", 10);
        vaTest("Три аргумента переменной длины: ", 1, 2, 3);
        vaTest("Без аргументов переменной длины: ");
    }
}
