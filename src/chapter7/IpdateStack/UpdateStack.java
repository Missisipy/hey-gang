package chapter7.IpdateStack;

public class UpdateStack {
    private int[] stck;
    private int tos;
    UpdateStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    void push(int item) {
        if (tos == stck.length - 1) System.out.println("Стек полон.");
        else stck[++tos] = item;
    }
    int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошён.");
            return 0;
        } else return stck[tos--];
    }
}
