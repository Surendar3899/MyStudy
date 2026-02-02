package LeetCode;

import java.util.Stack;

public class SimplifyPath_71 {

    public static void main(String[] args) {

        Stack<String> a = new Stack<>();
        a.push("a");
        a.push("b");
        a.push("c");
        a.pop();
        a.push("d");
        System.out.println(a);

        String b = String.join("/",a);
        System.out.println("b is "+b);
        String path = "/home/user/Documents/../Pictures";
        String result = simplifyPath(path);
        System.out.println("result is "+result);
    }

    public static String simplifyPath(String path) {
        final String[] DIRS = path.split("/");
        Stack<String> stack = new Stack<>();

        for (final String dir : DIRS) {
            if (dir.isEmpty() || dir.equals("."))
                continue;
            if (dir.equals("..")) {
                if (!stack.isEmpty())
                stack.pop();
            } else {
                stack.push(dir);
            }
        }

        return "/" + String.join("/", stack);
    }

}
