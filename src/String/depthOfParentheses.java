package String;

import java.util.ArrayList;
import java.util.List;

public class depthOfParentheses {

    //leetcode problem : 1614 Maximum Nesting Depth of Parenthesis
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    public static int maxDepth(String s) {
        List<Character> parentheses = new ArrayList<>();
        int depth=0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                parentheses.add(ch);
                depth = Math.max(depth,parentheses.size());
            }else if(ch==')'){
                parentheses.remove(parentheses.size()-1);
            }
        }
        return depth;
    }
}
