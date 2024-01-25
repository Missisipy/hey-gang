package chapter7.IpdateStack;

import chapter6.Stack;

public class UpdateStackTest {

    public static void main(String[] args){

        UpdateStack stack1 = new UpdateStack(5);
        UpdateStack stack2 = new UpdateStack(8);

        for (int i = 0; i < 5; i++) stack1.push(i);
        for (int i = 0; i < 8; i++) stack2.push(i);

        for (int i = 0; i < 5; i++) System.out.println(stack1.pop());
        for (int i = 0; i < 8; i++) System.out.println(stack2.pop());
    }
}
