package easyProblems;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        char[] chs= s.toCharArray();
        int n = s.length();
        for(int i=0; i< n;i++){
            if(chs[i] == '(' || chs[i] == '{' || chs[i] == '['){
                stack.push(chs[i]);
            }else if(stack.isEmpty()){
                return false;
            }else if((chs[i] == ')' && stack.peek() == '(')
            || (chs[i] == ']' && stack.peek() == '[') ||
                    (chs[i] == '}' && stack.peek() == '{')){
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }


}
