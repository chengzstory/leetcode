package day_5;

import java.util.Stack;

/**
 * Created by chengzstory on 2018/9/21.
 */
public class ReplacePlaceHolder {
    // {} {} {} {}
    public static boolean match(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String args[]) {
        String str = "[{}]";
//        Map params = new HashMap();
//        params.put("code", 785132);
//        params.put("name", "chengzhi");
        System.out.println(match(str));
    }
}
