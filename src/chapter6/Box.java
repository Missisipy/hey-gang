package chapter6;

import java.util.Scanner;

public class Box {

    Scanner scanner = new Scanner(System.in);

    public double width;
    public double height;
    public double depth;

    double volume(){

        return (width * height * depth);
    }

    Box(){
        System.out.print("Введите длину коробки: ");
        this.width = scanner.nextDouble();

        System.out.print("Введите высоту коробки: ");
        this.height = scanner.nextDouble();

        System.out.print("Введите глубину коробки: ");
        this.depth = scanner.nextDouble();
    }
}
