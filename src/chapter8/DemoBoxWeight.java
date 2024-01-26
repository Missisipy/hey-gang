package chapter8;

import chapter6.Box;

class BoxV3 {

    private double width;
    private double height;
    private double depth;

    public double volume() {

        return (width * height * depth);
    }

    BoxV3(BoxV3 ob) {

        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    BoxV3(double width, double height, double depth) {

        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    BoxV3(double len) {

        width = height = depth = len;
    }

    BoxV3() {

        width = -1;
        height = -1;
        depth = -1;
    }
}

class BoxWeight extends BoxV3 {

    double weight;

    BoxWeight (BoxWeight ob) {

        super(ob);
        weight =ob.weight;
    }

    BoxWeight () {

        super();
        weight = -1;
    }

    BoxWeight (double len, double weight) {

        super(len);
        this.weight = weight;
    }

    BoxWeight (double width, double height, double depth, double weight) {

        super (width, height, depth);
        this.weight = weight;
    }

    void getInfoWeight () {

        System.out.println(weight);
    }
}

class Shipment extends BoxWeight {

    double cost;
     Shipment (Shipment ob) {

         super(ob);
         cost = ob.cost;
     }

     Shipment (double width, double height, double depth, double weight, double cost) {

         super(width, height, depth, weight);
         this.cost = cost;
     }

     Shipment () {

         super();
         cost = -1;
     }

     Shipment (double len, double weight, double cost) {

         super(len, weight);
         this.cost = cost;
     }
}

public class DemoBoxWeight {

    public static void main(String[] args) {

        var mybox1 = new BoxWeight(10, 20, 15, 34.3);
        var shipment1 = new Shipment(2, 3, 4, 0.76, 1.28);
        var shipment2 = new Shipment(5, 8.43, 4.23);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объём mybox1 равен " + vol);
        System.out.print("Вес mybox1 равен ");
        mybox1.getInfoWeight();

        vol = shipment1.volume();
        System.out.println("Объём shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки составляет " + shipment1.cost);

        vol = shipment2.volume();
        System.out.println("Объём shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки составляет " + shipment2.cost);
    }
}
