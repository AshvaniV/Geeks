package ds99.dataStructure.allLevel.stackAndQueue;

import java.util.Stack;

public class SQ6 {
    static boolean ispar(String S)
    {
        Stack<Character> St = new Stack<>();
        for(int i = 0 ; i < S.length() ; i++) {
            char c = S.charAt(i);
            if(c == '[' || c == '{' || c == '(' ) {
                St.push(c);
            }
            else if(c == ']')
            {
                if(St.pop() != '['|| St.isEmpty())
                    return false;
            }
            else if(c == '}')
            {
                if(St.pop() != '{'|| St.isEmpty())
                    return false;
            }
            else if(c == ')')
            {
                if(St.pop() != '('|| St.isEmpty())
                    return false;
            }

        }

        return St.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(ispar("{([])}"));
    }
}
