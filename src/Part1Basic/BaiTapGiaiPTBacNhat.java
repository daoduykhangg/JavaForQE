package Part1Basic;

import java.util.Scanner;

public class BaiTapGiaiPTBacNhat {
    public static void main(String[] args) {
        double a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số a = ");
        a = sc.nextDouble();
        System.out.print("Nhập vào số b = ");
        b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else {
            x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
}
