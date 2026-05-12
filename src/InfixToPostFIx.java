import java.util.*;

public class InfixToPostFIx {
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
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any expression");
        String exp=sc.nextLine();
        sc.close();

        Stack<Character> stk=new Stack<>();
        String pexpression="";

        for (int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);

            if (Character.isLetterOrDigit(ch)){
                pexpression=pexpression+ch;
            }
            else if (ch == '(') {
                stk.push(ch);
            }
            else if (ch == ')') {
                    while (!stk.isEmpty() && stk.peek() !='('){
                        pexpression=pexpression+stk.pop();
                    }
                    stk.pop();
            }
            else {
                while (!stk.isEmpty() && stk.peek() != '(' && precedence(stk.peek()) >= precedence(ch)) {
                    pexpression = pexpression + stk.pop();
                }
                stk.push(ch);
            }
            }


        while (!stk.isEmpty()) {
            pexpression = pexpression + stk.pop();
        }

        System.out.println("PostFix Expression: "+pexpression);
        }


    }

