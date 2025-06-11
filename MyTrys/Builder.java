package MyTrys;

import java.util.Stack;

public class Builder {
    public static void main(String[] args) {
        StringBuilder bui = new StringBuilder();

        Stack<StringBuilder> stStr = new Stack<>();
        stStr.push(new StringBuilder("aaaa"));
        stStr.push(new StringBuilder("bbb"));
        stStr.push(bui);
        stStr.push(new StringBuilder("db"));

        System.out.println(stStr.pop());
        System.out.println(stStr.pop());
        System.out.println(stStr.pop());

        System.out.println(stStr.peek());
        System.out.println(stStr.pop());
        System.out.println(stStr.pop());

        
    }
}
