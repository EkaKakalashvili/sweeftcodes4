package com.eka;
        import java.util.Scanner;
        import java.util.Arrays;
        import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sequence: ");
        String expression = scanner.nextLine();
        if (isProperly(expression)) {
            System.out.println("Parenthesis are written correctly.");
        } else {
            System.out.println("Parenthesis are written incorrectly;");
        }
    }

    public static boolean isProperly(String expression) {
        Stack<Character> parenthesis = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                parenthesis.push('(');
            }
            if (expression.charAt(i) == ')') {
                if (!parenthesis.empty()) {
                    parenthesis.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
