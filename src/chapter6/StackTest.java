package chapter6;

public class StackTest {

    public static void main(String[] args){

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (int i = 0; i < 10; i++) stack1.push(i);
        for (int i = 10; i < 20; i++) stack2.push(i);

        for (int i = 0; i < 10; i++) System.out.println(stack1.pop());
        for (int i = 10; i < 20; i++) System.out.println(stack2.pop());
    }
}
