package chapter7;

public class AnalyzGiveParameters {
    int a, b;
    AnalyzGiveParameters (int i, int j) {
        a = i;
        b = j;
    }
    void meth(AnalyzGiveParameters o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class CallByValue {
    public static void main(String[] args) {
        AnalyzGiveParameters ob = new AnalyzGiveParameters(15, 20);

        System.out.println("a и b перед вызовом: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("a и b после вызова: " + ob.a + " " + ob.b);
    }
}