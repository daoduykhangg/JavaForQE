package PartIIOOP.Lesson49;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String s = sc.nextLine();
        System.out.println("---------------");
        System.out.println(s.length());
        System.out.println("---------------");
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Vị trí " + i + " là: " + s.charAt(i));
        }

        char[] arrChar = new char[10];
        s.getChars(0, 5, arrChar, 0);
        for (int i = 0; i < arrChar.length; i++) {
            System.out.println(arrChar[i]);
        }
        byte[] arrbytes = s.getBytes();
        for (byte arrbyte : arrbytes) {
            System.out.println(arrbyte);
        }
    }
}
