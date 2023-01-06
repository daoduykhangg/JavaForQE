import java.util.Scanner;

public class Lesson11 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào a = ");
        a = sc.nextInt();

        System.out.print("Nhập vào b = ");
        b = sc.nextInt();

        int tong = a + b;
        System.out.println("tong = " + tong);

        int hieu = a - b;
        System.out.println("hieu = " + hieu);

        int tich = a * b;
        System.out.println("tich = " + tich);

        float thuong = (float) a / b;
        System.out.println("thuong = " + thuong);

        int soDu = a % b;
        System.out.println("soDu = " + soDu);
    }
}
