package Part1Basic;

import java.util.Scanner;

public class BaiTapSwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào năm: ");
        int year = scan.nextInt();

        System.out.print("Nhập vào tháng: ");
        int month = scan.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Số tháng không hợp lệ");
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng " + month + " có 30 ngày");
                    break;

                case 2:
                    if (year % 4 == 0 || year % 400 == 0) {
                        System.out.println(year + " là năm nhuận và tháng " + month + " có 29 ngày");
                        break;
                    } else {
                        System.out.println("Tháng " + month + " có 28 ngày");
                        break;
                    }

            }
        }
    }
}
