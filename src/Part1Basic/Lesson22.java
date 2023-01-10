package Part1Basic;

import java.util.Scanner;

public class Lesson22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 2; i <= 9; i++) {
            System.out.println("Bảng cửu chương " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
