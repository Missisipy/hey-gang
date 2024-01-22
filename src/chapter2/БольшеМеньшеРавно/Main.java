package chapter2.БольшеМеньшеРавно;

public class Main {

    public static void main(String[] args) {
        
        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println("Значение x меньше y");

        x *= 2; // x = 20, y = 20

        if (x == y) System.out.println("Теперь значение x равно y");

        x *= 2; // x = 40, y = 20

        if (x > y) System.out.println("Теперь значение x больше y");

        if (x == y) System.out.println("Это сообщение не выведется");
    }
}
