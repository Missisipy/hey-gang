class MyClass {

    int number;
    int a;

    MyClass (int number, int a) {

        this.number = number * 2;
        this.a = a + 1;
    }

    void getValues (MyClass x) {

        System.out.println(x.number + " " + x.a);
    }
}

public class TestClass {

    static int setDim(MyClass x) {

        return x.number * x.a;
    }

    public static void main(String[] args) {

        var num = 10;

        var Count1 = new MyClass(num, num);
        var Count2 = new MyClass(num - 5, num - 5);

        var res = setDim(Count2);

        System.out.println(res);

        Count1.getValues(Count1);
        Count2.getValues(Count2);
    }
}
