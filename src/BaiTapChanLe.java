import java.util.Scanner;

public class BaiTapChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số n = ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn");
        } else {
            System.out.println(n + " là số lẻ");
        }
    }
}
