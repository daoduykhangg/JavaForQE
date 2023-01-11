package PartIIOOP.Lesson45;

public class XeDap extends PhuongTienDiChuyen {
    public XeDap(HangSanXuat hangSanXuat, String loaiPhuongTien) {
        super(hangSanXuat, loaiPhuongTien);
    }

    @Override
    public int layVanToc() {
        return 20;
    }
}
