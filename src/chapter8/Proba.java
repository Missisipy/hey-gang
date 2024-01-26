package chapter8;

public class Proba {
    int i, j;

    Proba (int a, int b) {
        i = a;
        j = b;
    }
    void show () {
        System.out.println("i и j: " + i + " " + j);
    }
}

class Prob extends Proba {

    int k;
    Prob (int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show () {
        super.show();
        System.out.println("k: " + k);
    }
}
class Override {

    public static void main(String[] args) {

        var prob = new Prob (1, 2, 3);
        prob.show();
    }
}
