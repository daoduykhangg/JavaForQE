package PartIIOOP.Lesson35;

public class TacGia {
    String tenTacGia;
    NgaySinh ngaySinh;

    public TacGia(String tenTacGia, NgaySinh ngaySinh) {
        this.tenTacGia = tenTacGia;
        this.ngaySinh = ngaySinh;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    @Override
    public String toString() {
        return this.tenTacGia;
    }
}
