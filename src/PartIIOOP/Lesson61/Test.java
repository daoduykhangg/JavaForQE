package PartIIOOP.Lesson61;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        boolean counTinuing = true;
        Scanner sc = new Scanner(System.in);
        int option;
        String msv;
        String ten;
        DanhSachSinhVien danhSachSV = new DanhSachSinhVien();
        do {
            printMenu();
            System.out.print("Mời chọn: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    danhSachSV.themSinhVienVaoDanhSach();
                    break;
                case 2:
                    danhSachSV.inRaDanhSachSinhVien();
                    break;
                case 3:
                    danhSachSV.kiemTraDanhSachCoRong();
                    break;
                case 4:
                    danhSachSV.soLuongSinhVienTrongDanhSach();
                    break;
                case 5:
                    danhSachSV.lamRongDanhSachSienVien();
                    System.out.println("Đã làm rỗng danh sách sinh viên");
                    break;
                case 6:
                    System.out.print("Nhập mã sinh viên: ");
                    msv = sc.nextLine();
                    danhSachSV.kiemTraSinhVienCoTonTaiBangMSV(msv);
                    break;
                case 7:
                    System.out.print("Nhập mã sinh viên: ");
                    msv = sc.nextLine();
                    danhSachSV.xoaSinhVienBangMSV(msv);
                    break;
                case 8:
                    System.out.print("Nhập tên sinh viên: ");
                    ten = sc.nextLine();
                    danhSachSV.timKiemTatCaSinhVienBangTen(ten);
                    break;
                case 9:
                    counTinuing = false;
                    break;
                default:
                    throw new RuntimeException("Choose wrong option !");
            }
        } while (counTinuing);
    }

    private static void printMenu() {
        System.out.println("*****Menu*****");
        System.out.println("1. Thêm sinh viên vào danh sách");
        System.out.println("2. In ra danh sách sinh viên");
        System.out.println("3. Kiểm tra danh sách có rỗng hay không");
        System.out.println("4. Lấy ra số lượng sinh viên trong danh sách");
        System.out.println("5. Làm rỗng danh sách sinh viên");
        System.out.println("6. Kiểm tra 1 sinh viên có tồn tại, dựa vào MSV");
        System.out.println("7. Xóa 1 sinh viên dựa vào MSV");
        System.out.println("8. Tìm kiếm tất cả sinh viên dựa trên Tên");
        System.out.println("9. Thoát");
String a = "asdsa";
        System.out.println(a.charAt(0) == 'a');
    }
}
