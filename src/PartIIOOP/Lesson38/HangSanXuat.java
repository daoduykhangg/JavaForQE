package PartIIOOP.Lesson38;

public class HangSanXuat {
    private String tenHang;
    private QuocGia quocGia;

    public HangSanXuat(String tenHang, QuocGia quocGia) {
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public String layTenQuocGia() {
        return quocGia.getTenQG();
    }
}
