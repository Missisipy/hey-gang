package chapter9.IfaceRealization;

public class Client implements CallBack, Incomp.NestedF {

    public void callback (int p) {
        System.out.println("callback() вызывается со значением " + p);
    }
    void nonIfaceMeth () {
        System.out.println("Классы, которые реализ интерфейсы" +
                "могут также определять и другие члены.");
    }
    public boolean isNotNegative(int x) {
        return x > 0 ? true : false;
    }
}
