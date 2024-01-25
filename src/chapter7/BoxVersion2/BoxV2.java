package chapter7.BoxVersion2;


public class BoxV2 {

    public double width;
    public double height;
    public double depth;

    public double volume(){

        return (width * height * depth);
    }

    BoxV2(BoxV2 ob) {

        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    BoxV2(double width, double height, double depth){

        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    BoxV2(double len) {

        width = height = depth = len;
    }

    BoxV2() {

        width = -1;
        height = -1;
        depth = -1;
    }
}
