import java.util.Scanner;

public class Lession09Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào họ và tên: ");
        String hoVaTen = sc.nextLine();

        System.out.print("Nhập vào mã sinh viên: ");
        long maSinhVien = sc.nextLong();

        System.out.print("Nhập vào điểm thi toán: ");
        float diemToan = sc.nextFloat();

        System.out.println("----------------------------");
        System.out.println("Họ và tên: " + hoVaTen);
        System.out.println("Mã sinh vien: " + maSinhVien);
        System.out.println("Điểm toán: " + diemToan);


    }
}
