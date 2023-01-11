package PartIIOOP.Lesson45;

public class XeOto extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public XeOto(HangSanXuat hangSanXuat, String loaiPhuongTien, String loaiNhienLieu) {
        super(hangSanXuat, loaiPhuongTien);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public int layVanToc() {
        return 120;
    }
}
