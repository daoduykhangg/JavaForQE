package PartIIOOP.Lesson31;

public class Test {
    public static void main(String[] args) {
        HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyên", 100000, 3.5);
        HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyên", 200000, 3.5);
        System.out.println("TongTien = " + hd.tinhTongTien());
        System.out.println("Kiểm tra khối lượng > 4kg: " + hd.kiemTraKhoiLuongLonHon(3));
        System.out.println("Kiểm tra tổng tiền > 500k: " + hd.kiemTraTongTienLonHon500k());
        System.out.println("Giảm giá tiền hd: " + hd.giamGia(10));
        System.out.println("Giảm giá tiền hd2: " + hd2.giamGia(10));
        System.out.println("Tổng tiền sau khi giảm giá tiền hd: " + hd.tongTienSauKhiGiamGia(10));
        System.out.println("Tổng tiền sau khi giảm giá tiền hd2: " + hd2.tongTienSauKhiGiamGia(10));
    }
}
