package charpter4.Операции;

public class Main {
    public static void main(String[] args){
        // удобное деление на 2 побитовым сдвигом вправо
        int x = 120;
        x >>= 1;
        System.out.println(x + "\n");

        x = x == 60 ? x >> 1 : x; // операция ?

        System.out.println(x + "\n");

    }
}
