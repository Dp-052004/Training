package DSAssgn;

import java.util.Stack;

public class Postfix_Implementation {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] vals = expression.split(" ");

        for (String token : vals) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (token) {
                    case "+": stack.push(val1 + val2);
                              break;
                    case "-": stack.push(val1 - val2);
                              break;
                    case "*": stack.push(val1 * val2);
                              break;
                    case "/": stack.push(val1 / val2);
                              break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "10 2 8 * + 3 -"; 
        System.out.println("Result: " + evaluatePostfix(exp)); 
    }
}