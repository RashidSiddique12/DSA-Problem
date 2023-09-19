import java.util.Stack;

public class InfixtoPostfix {
    public static String infixToPosfix(String s) {
        // need one stack and one stringBuilder
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // codition...
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') {
                sb.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && prec(ch) <= prec(st.peek())) {
                    sb.append(st.pop());
                }
                st.push(ch);
            }

        }

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }

    public static int prec(char ch) {
        if (ch == '^')
            return 3;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;

        return -1;
    }

    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        String res = infixToPosfix(s);
        System.out.println(res);
    }
}
