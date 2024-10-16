package fororder;

import java.util.HashMap;
import java.util.Stack;

public class Number020 {

    public boolean isValid(String s) {

        // 把括号放进栈里，如果遇到匹配的
        // 如（）{} [] 这三对就出栈，如果遍历到最后，栈为空，就有效
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        Character[] chs = new Character[arr.length];

        for (int i = 0; i < arr.length; i++) {
            chs[i] = arr[i];
        }

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (int i = 0; i < chs.length; i++) {
            // 栈非空
            if (!stack.isEmpty()) {
                if (map.get(stack.peek()) == chs[i]) {
                    stack.pop();
                    continue;
                }
            }
            // 栈为空
            stack.push(chs[i]);
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {


    }
}
