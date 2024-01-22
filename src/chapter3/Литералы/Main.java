package chapter3.Литералы;

public class Main {
    public static void main(String[] args){

        long a = 0x7fffffffffffffffL; // max значение типа long в 16-теричной системе исчесления

        int b = 0b1010; // двоичная форма представления

        int c = 123_456_789; // символ подчеркивания, предназначен для упрощения чтения больших чисел

        int d = 0b1101_0101_0001_1010; // тоже самое в двоичной системе счисления

        double e = 0x12.2P2; // 16-теричный литерал с плавающей точкой

        System.out.println("\bнапуган до смерти \nи истощён жаждой" + "12345\r6789");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
