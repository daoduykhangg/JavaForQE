import java.util.Scanner;

public class Lesson16 {
    public static void main(String[] args) {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số a = ");
        a = sc.nextFloat();
        System.out.print("Nhập vào số b = ");
        b = sc.nextFloat();

        System.out.println("|a| = " + Math.abs(a));
        System.out.println("min(a, b) = " + Math.min(a, b));
        System.out.println("max(a, b) = " + Math.max(a, b));
        System.out.println("ciel(a) = " + Math.ceil(a));
        System.out.println("floor(a) = " + Math.floor(a));
        System.out.println("a^b = " + Math.pow(a, b));
        System.out.println("sqrt(a) = " + Math.sqrt(a));
    }
}
