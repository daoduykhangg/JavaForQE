package PartIIOOP.Lesson62;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        System.out.print("Nhập vào chuỗi: ");
        String chuoistack = sc.nextLine();
        for (int i = 0; i < chuoistack.length(); i++) {
            stack.push(chuoistack.charAt(i));
        }
        System.out.print("Đảo ngược chuỗi: ");
        for (int i = 0; i < chuoistack.length(); i++) {
            System.out.print(stack.pop());
        }

        Stack<Integer> stackNumber = new Stack<>();
        System.out.print("\nNhập vào số: ");
        int number = sc.nextInt();
        while (number > 0) {
            int soDu = number % 2;
            stackNumber.push(soDu);
            number /= 2;
        }
        int n = stackNumber.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stackNumber.pop());
        }
    }
}
