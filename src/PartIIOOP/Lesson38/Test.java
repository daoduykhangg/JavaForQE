package PartIIOOP.Lesson38;

public class Test {
    public static void main(String[] args) {
        QuocGia quocGia1 = new QuocGia("QG1", "VietNam");
        QuocGia quocGia2 = new QuocGia("QG2", "China");
        QuocGia quocGia3 = new QuocGia("QG3", "Japan");

        HangSanXuat hangSanXuat1 = new HangSanXuat("DELL", quocGia1);
        HangSanXuat hangSanXuat2 = new HangSanXuat("HP", quocGia2);
        HangSanXuat hangSanXuat3 = new HangSanXuat("Apple", quocGia3);

        Ngay ngay1 = new Ngay(31, 12, 2019);
        Ngay ngay2 = new Ngay(4, 1, 2017);
        Ngay ngay3 = new Ngay(29, 6, 2018);

        MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngay1, 36, 29000000);
        MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngay2, 36, 31000000);
        MayTinh mayTinh3 = new MayTinh(hangSanXuat3, ngay3, 36, 35000000);

        System.out.println(mayTinh1.getTenHang() + " có giá bán thấp hơn " + mayTinh2.getTenHang() + " hay không: " + mayTinh1.kiemTraMayTinhGiaCoThapHon(mayTinh2));
        System.out.println(mayTinh3.getTenHang() + " có giá bán thấp hơn " + mayTinh2.getTenHang() + " hay không: " + mayTinh3.kiemTraMayTinhGiaCoThapHon(mayTinh2));

        System.out.println("máy tính 1 tên quốc gia: " + mayTinh1.getTenQG());
        System.out.println("máy tính 2 tên quốc gia: " + mayTinh2.getTenQG());
        System.out.println("máy tính 3 tên quốc gia: " + mayTinh3.getTenQG());
    }
}
