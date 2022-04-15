import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{{()}}"));
    }
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char chx = s.charAt(i);

            if(chx == '(' || chx == '{' || chx == '['){

                stack.push(chx);

            } else if(chx == ')' || chx == '}' || chx == ']'){
                if (!stack.isEmpty()) {
                    char c = stack.pop();
                    if (c == '(' && chx != ')' || c == '{' && chx != '}'|| c == '[' && chx != ']' ) {
                        return false;
                    }
                } else {
                    return false;
                }
            }

        }
        if(!stack.isEmpty()){
            return false;
        }

        return true;
    }



}
