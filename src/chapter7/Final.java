package chapter7;

public class Final {
    public static void main(String[] args) {
        final int FILE_NEW = 1;
        // FILE_NEW += 1; // Ошибка!
        System.out.println(FILE_NEW);
    }
}
