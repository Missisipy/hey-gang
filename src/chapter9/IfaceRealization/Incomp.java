package chapter9.IfaceRealization;

public class Incomp extends Incomplete{

    void show() {
        super.show();
        System.out.println("5 5 5 5 5");
    }
    public void callback(int param) {
        System.out.println(param * param * param);
    }

    public interface NestedF {
        boolean isNotNegative (int x);
    }
}
