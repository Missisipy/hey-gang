package chapter6;

public class Main {

    public static void main (String[] args){

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        vol = mybox1.volume();
        System.out.println("Объём коробки равен: " + vol);

        vol = mybox2.volume();
        System.out.println("Объём коробки равен: " + vol);
    }
}
