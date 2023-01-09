package Lesson31;

public class HoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaTien1Kg;
    private double khoiLuong;

    public HoaDonCaPhe(String tenLoaiCaPhe, double giaTien1Kg, double khoiLuong) {
        this.tenLoaiCaPhe = tenLoaiCaPhe;
        this.giaTien1Kg = giaTien1Kg;
        this.khoiLuong = khoiLuong;
    }

    public double tinhTongTien() {
        return giaTien1Kg * khoiLuong;
    }

    public boolean kiemTraKhoiLuongLonHon(double kl) {
        return this.khoiLuong > kl;
    }

    public boolean kiemTraTongTienLonHon500k() {
        return this.tinhTongTien() > 500000;
    }

    public double giamGia(double x) {
        if (tinhTongTien() > 500000) {
            return tinhTongTien() * (x / 100);
        } else {
            return 0;
        }
    }

    public double tongTienSauKhiGiamGia(double x) {
        return tinhTongTien() - giamGia(x);
    }
}
