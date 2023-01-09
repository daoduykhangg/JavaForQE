package Lesson35;

public class Sach {
    String tenSach;
    double giaSach;
    int namXuatBan;
    TacGia tacGia;

    public Sach(String tenSach, double giaSach, int namXuatBan, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaSach = giaSach;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(double giaSach) {
        this.giaSach = giaSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public void inTenSach() {
        System.out.println(this.getTenSach());
    }

    public boolean kiemTraCungNamXuatBan(Sach sachKhac) {
        return this.namXuatBan == sachKhac.namXuatBan;
    }

    public double giaSauKhiGiam(double x) {
        return giaSach = giaSach - giaSach * (x / 100);
    }

    @Override
    public String toString() {
        return this.tenSach + ", " + this.giaSach + ", " + this.namXuatBan + ", " + this.tacGia;
    }
}
