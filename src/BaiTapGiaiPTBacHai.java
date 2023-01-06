import java.util.Scanner;

public class BaiTapGiaiPTBacHai {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số a = ");
        a = sc.nextDouble();

        System.out.print("Nhập vào số b = ");
        b = sc.nextDouble();

        System.out.print("Nhập vào số c = ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - (4 * a * c);
        if (a == 0) {
            System.out.println("Nhập dữ liệu sai!");
        } else {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm !");
            } else if (delta == 0) {
                x1 = x2 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x1);
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
