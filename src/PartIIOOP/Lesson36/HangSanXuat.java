package PartIIOOP.Lesson36;

public class HangSanXuat {
    private String tenHangSanXuat;
    private String quocGia;

    public HangSanXuat(String tenHangSanXuat, String quocGia) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "Tên hãng sản xuất phim: " + tenHangSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
}
