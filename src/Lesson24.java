import java.util.Scanner;

public class Lesson24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số thập phân: ");
        int n = sc.nextInt();

        String nhiPhan = "";
        while (n > 0) {

            nhiPhan = (n % 2) + nhiPhan;
            n /= 2;
        }
        System.out.println("Hệ nhị phân của " + n + " là : " + nhiPhan);
    }
}
