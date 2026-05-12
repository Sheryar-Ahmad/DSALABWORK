import java.util.*;

public class InfixToPrefix {

    public static int precedence(char op) {
        if (op == '*' || op == '/') {
            return 2;
        }
        else if (op == '+' || op == '-') {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any expression");
        String exp = sc.nextLine();
        sc.close();

        // Step 1: Reverse string and swap parentheses
        String reversed = "";
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                reversed = reversed + ')';
            }
            else if (ch == ')') {
                reversed = reversed + '(';
            }
            else {
                reversed = reversed + ch;
            }
        }

        Stack<Character> stk = new Stack<>();
        String result = "";

        // Step 2: Process reversed string
        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result = result + ch;
            }
            else if (ch == '(') {
                stk.push(ch);
            }
            else if (ch == ')') {
                while (!stk.isEmpty() && stk.peek() != '(') {
                    result = result + stk.pop();
                }
                stk.pop();
            }
            else {
                while (!stk.isEmpty() && stk.peek() != '(' && precedence(stk.peek()) > precedence(ch)) {
                    result = result + stk.pop();
                }
                stk.push(ch);
            }
        }

        while (!stk.isEmpty()) {
            result = result + stk.pop();
        }

        // Step 3: Reverse result to get prefix
        String prefix = "";
        for (int i = result.length() - 1; i >= 0; i--) {
            prefix = prefix + result.charAt(i);
        }

        System.out.println("Prefix Expression: " + prefix);
    }
}