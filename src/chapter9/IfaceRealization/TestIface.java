package chapter9.IfaceRealization;

public class TestIface {

    public static void main(String[] args) {

        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c =ob;
        c.callback(42);
    }
}
