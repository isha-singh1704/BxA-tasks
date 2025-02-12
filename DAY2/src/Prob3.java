import java.util.Stack;

public class Prob3 {
    public static void main(String[] args) {
        Prob3 prob3=new Prob3();
        String s="[(())]";
        System.out.println(prob3.isValid(s)); }
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        for (int i = 0; i < n; i++) {
            if (isOpeningBracket(s.charAt(i))){
                stack.push(s.charAt(i));
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                char top=stack.peek();
                char popped=stack.pop();
                if (CheckCorresponding(s.charAt(i),popped)){
                    continue;

                }else {
                    return false;
                }
            }
        }
        if (stack.isEmpty())
            return true;
        return false;

    }

    private static boolean isOpeningBracket(char element) {
        return element == '(' || element == '{' || element == '[';
    }


    private static boolean CheckCorresponding(char c,char popped) {
        if ((c==')'&& popped=='(') || (c==']'&& popped=='[') || (c=='}'&& popped=='{')){
            return true;
        }
        return false;
    }
}
