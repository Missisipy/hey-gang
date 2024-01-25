package chapter7.BoxVersion2;

import chapter6.Box;

public class OverloadCons {
    public static void main (String[] args){

        BoxV2 mybox1 = new BoxV2(10, 20, 15);
        BoxV2 mybox2 = new BoxV2();
        BoxV2 mycube = new BoxV2(7);
        BoxV2 myclone = new BoxV2(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объём коробки равен: " + vol);

        vol = mybox2.volume();
        System.out.println("Объём коробки равен: " + vol);

        vol = mycube.volume();
        System.out.println("Объём куба равен: " + vol);

        vol = myclone.volume();
        System.out.println("Объём копии равен: " + vol);
    }
}
