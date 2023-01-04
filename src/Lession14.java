import java.util.Scanner;

public class Lession14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số a = ");
        int a = sc.nextInt();

        System.out.print("Nhập vào số b = ");
        int b = sc.nextInt();

        System.out.println(a + " == " + b + " : " + (a == b));
        System.out.println(a + " != " + b + " : " + (a != b));
        System.out.println(a + " < " + b + " : " + (a < b));
        System.out.println(a + " <= " + b + " : " + (a <= b));
        System.out.println(a + " > " + b + " : " + (a > b));
        System.out.println(a + " >= " + b + " : " + (a >= b));
        System.out.println("--------------------------");
        System.out.println("Cả 2 số đều là số chắn: " + (a % 2 == 0 && b % 2 == 0));
        System.out.println("1 trong 2 số là số chắn: " + (a % 2 == 0 || b % 2 == 0));
    }
}
