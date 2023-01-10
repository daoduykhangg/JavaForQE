package PartIIOOP.Lesson38;

public class MayTinh {
    private HangSanXuat hangSanXuat;
    private Ngay ngaySanXuat;
    private int thoiGianBaoHanh;
    private double giaBan;

    public MayTinh(HangSanXuat hangSanXuat, Ngay ngaySanXuat, int thoiGianBaoHanh, double giaBan) {
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.giaBan = giaBan;
    }

    public boolean kiemTraMayTinhGiaCoThapHon(MayTinh mayTinh) {
        return this.giaBan < mayTinh.giaBan;
    }

    public String getTenHang() {
        return hangSanXuat.getTenHang();
    }

    public String getTenQG() {
        return hangSanXuat.layTenQuocGia();
    }
}
