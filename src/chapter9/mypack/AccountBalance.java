package chapter9.mypack;

public class AccountBalance {

    public static void main(String[] args) {

        Balance[] current = new Balance[3];

        current[0] = new Balance("Федот", 123.23);
        current[1] = new Balance("Павел", 157.02);
        current[2] = new Balance("Петро", -12.33);

        for (int i = 0; i < current.length; i++) {
            current[i].show();
        }
    }
}
