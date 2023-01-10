package PartIIOOP.Lesson36;

public class Phim {
    private String tenPhim;
    private int namSanXuat;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private NgayChieu ngayChieu;

    public Phim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, NgayChieu ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public boolean kiemTraGiaVeCoReHonPhimKhac(Phim phimKhac) {
        return this.giaVe < phimKhac.giaVe;
    }

    public String tenHangSanXuat() {
        return this.hangSanXuat.getTenHangSanXuat();
    }

    public double giaVeSauKhuyenMai(double x) {
        return giaVe -= (giaVe * (x / 100));
    }
}
