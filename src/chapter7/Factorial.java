package chapter7;

public class Factorial {

    int fact(int i) {
        int result;

        if (i == 1) {
            System.out.println("*" + i);
            return 1;
        }
        System.out.println("*" + i);
        result = fact(i - 1) * i;
        System.out.println(result);
        return result;
    }
}

class Recursion {
    public  static void main(String[] args) {
        Factorial fct = new Factorial();

        System.out.println("F 3 = " + fct.fact(3));

        System.out.println("F 4 = " + fct.fact(4));

        System.out.println("F 5 = " + fct.fact(5));
    }
}