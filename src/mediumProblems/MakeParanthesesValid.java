package mediumProblems;

import java.util.Stack;

public class MakeParanthesesValid {
    public static void main(String[] args) {
       String str = "())))";
        System.out.println(minAddToMakeValid(str));
    }
    public static int minAddToMakeValid(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int count =0;
        Stack<Character> stack= new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else if(stack.isEmpty()){
                count++;
            }else {
                stack.pop();
            }
        }
        return count+stack.size();
    }
}
