import java.util.Scanner;

public class Lesson16_02 {
    public static void main(String[] args) {
        double r, dienTich, chuVi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào r = ");
        r = sc.nextDouble();

        chuVi = 2 * r * Math.PI;
        System.out.println("Chu vi = " + chuVi);
        System.out.println("Chu vi = " + Math.round(chuVi));
        System.out.println("Chu vi = " + Math.round(chuVi*100.0)/100.0);

        dienTich = Math.PI * Math.pow(r, 2);
        System.out.println("Diện tích = " + dienTich);
        System.out.println("Diện tích = " + Math.round(dienTich));
        System.out.println("Diện tích = " + Math.round(dienTich*100.0)/100.0);
    }
}
