package chapter7;

import java.util.Scanner;

public class RecTest {

    int[] values;

    RecTest (int i) {
        values = new int[i];
    }

    void printArray (int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}

class Recurtion2 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();

        RecTest object = new RecTest(Num);

        int i;

        for (i = 0; i < Num; i++) object.values[i] = i;

        object.printArray(Num);
    }
}