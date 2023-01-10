package Part1Basic;

import java.util.Scanner;

public class Lesson15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số a = ");
        int a = sc.nextInt();
        String ketQua = (a % 2 == 0) ? "số chẵn" : "số lẻ";
        System.out.println(a + " là " + ketQua);
    }
}
