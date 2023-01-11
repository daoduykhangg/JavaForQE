package PartIIOOP.Lesson45;

public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public MayBay(HangSanXuat hangSanXuat, String loaiPhuongTien, String loaiNhienLieu) {
        super(hangSanXuat, loaiPhuongTien);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh() {
        System.out.println("Cất cánh");
    }

    public void haCanh() {
        System.out.println("Hạ cánh");
    }

    @Override
    public int layVanToc() {
        return 500;
    }
}
