package j51_stack;

import java.util.Stack;

//栈
public class StackDemo {
    public static void main(String [] args){
        Stack<String> all = new Stack<>();
        all.push("a");
        all.push("b");
        all.push("c");
        System.out.println(all.pop());
        System.out.println(all.pop());
        System.out.println(all.pop());

    }
}
