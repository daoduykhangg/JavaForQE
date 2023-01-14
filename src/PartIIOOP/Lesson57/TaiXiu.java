package PartIIOOP.Lesson57;

import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000000;
        int option;
        int luaChon;
        double datCuoc;
        Scanner sc = new Scanner(System.in);
        do {
            printMenuTaiXiu();
            System.out.print("Mời bạn chọn: ");
            option = sc.nextInt();
            if (option == 1) {
                do {
                    System.out.println("Tài khoản của bạn: " + taiKhoanNguoiChoi + " bạn muốn đặt cược bao nhiêu?");
                    System.out.print("Đặt cược: ");
                    datCuoc = sc.nextDouble();
                } while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);
                do {
                    System.out.print("Chọn 1 <-> Tài và chọn 2 <-> Xỉu: ");
                    luaChon = sc.nextInt();
                } while (luaChon != 1 && luaChon != 2);
                Random xucXac1 = new Random();
                int giaTri1 = xucXac1.nextInt(5) + 1;
                Random xucXac2 = new Random();
                int giaTri2 = xucXac2.nextInt(5) + 1;
                Random xucXac3 = new Random();
                int giaTri3 = xucXac3.nextInt(5) + 1;
                System.out.println("Lắc xí ngầu: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
                int kq = giaTri1 + giaTri2 + giaTri3;
                if (kq == 3 || kq == 18) {
                    System.out.println("Kết quả: " + kq + " ==> Nhà cái ăn hết, bạn đã thua!");
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("Tài khoản của bạn: " + taiKhoanNguoiChoi);
                } else if (kq <= 11) {
                    System.out.println("Kết quả: " + kq + " ==> xỉu");
                    if (luaChon == 1) {
                        System.out.println("Bạn đã thua!");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Tài khoản của bạn: " + taiKhoanNguoiChoi);
                    } else {
                        System.out.println("Bạn đã thắng!");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("Tài khoản của bạn: " + taiKhoanNguoiChoi);
                    }
                } else {
                    System.out.println("Kết quả: " + kq + " ==> Tài");
                    if (luaChon == 1) {
                        System.out.println("Bạn đã thắng!");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("Tài khoản của bạn: " + taiKhoanNguoiChoi);
                    } else {
                        System.out.println("Bạn đã thua!");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("Tài khoản của bạn: " + taiKhoanNguoiChoi);
                    }
                }
            }
        } while (option == 1 && taiKhoanNguoiChoi != 0);

    }

    private static void printMenuTaiXiu() {
        System.out.println("******Menu******");
        System.out.println("Chon (1) để tiếp tục chơi");
        System.out.println("Chon (phím bất kỳ) để tiếp tục chơi");
    }
}
