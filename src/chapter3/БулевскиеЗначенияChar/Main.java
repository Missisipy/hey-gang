package chapter3.БулевскиеЗначенияChar;

public class Main {
    public static void main(String[] args){

        char ch1 = 88;
        char ch2 = 'Y';
        System.out.println(ch1 + " " + ch2);

        boolean F = false;
        boolean T = true;

        if (T) System.out.println(F);

        boolean res = T ? T : F;
    }
}
