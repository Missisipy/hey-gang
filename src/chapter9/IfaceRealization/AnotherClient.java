package chapter9.IfaceRealization;

public class AnotherClient implements CallBack {

    public void callback (int p) {
        System.out.println("Ещё одна реализация callback()\np в квадрате равно " + (p * p));
    }
}
