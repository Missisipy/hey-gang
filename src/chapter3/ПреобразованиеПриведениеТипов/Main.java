package chapter3.ПреобразованиеПриведениеТипов;

public class Main {
    public static void main(String[] args){
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nПреобразование int в byte.");
        b = (byte) i;
        System.out.println("i и b: " + i + " " + b);

        System.out.println("\nПреобразование double в int.");
        i = (int) d;
        System.out.println("d и i: " + d + " " + i);

        System.out.println("\nПреобразование double в byte.");
        b = (byte) d;
        System.out.println("d и b: " + d + " " + b);

        byte bt = 50;                   //bt присваивается тип int
        bt = (byte) (bt * 2);           //тип int нельзя помещать в тип byte, поэтому применяется
        System.out.println("\n" + bt);  //явное приведение типов, в нашем случае к типу byte

        /* Правила повышения типов:
        * byte, short, char -> int
        * int -> long
        * long -> float
        * float -> double */
    }
}
