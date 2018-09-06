package cn.linkai.newcodetest.jd;

import java.util.Scanner;
import java.util.Stack;

public class JD01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        int result = 1;
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            }

            if (c == ')') {
                int size = stack.size();
                result *= size;
                stack.pop();
            }
        }

        System.out.println(result);

    }
}

