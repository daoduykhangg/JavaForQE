package PartIIOOP.Lesson45;

public class Test {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Boing", "USA");
        HangSanXuat h2 = new HangSanXuat("Ford", "Japan");
        HangSanXuat h3 = new HangSanXuat("Martine", "VN");
        MayBay p1 = new MayBay(h1, "Máy bay", "Xăng");
        PhuongTienDiChuyen p2 = new XeDap(h3, "Xe 2 bánh");
        PhuongTienDiChuyen p3 = new XeOto(h2, "Xe 4 bánh", "dầu");

        System.out.println("Máy bay: ");
        p1.batDau();
        p1.catCanh();
        p1.tangToc();
        p1.haCanh();
        p1.dungLai();
        System.out.println(p1.layTenHangSanXuat());
        System.out.println(p1.layVanToc());
        System.out.println("-----------------------");


        System.out.println("Xe oto: ");
        p3.batDau();
        p3.tangToc();
        p3.dungLai();
        System.out.println(p3.layTenHangSanXuat());
        System.out.println(p3.layVanToc());
        System.out.println("-----------------------");

        System.out.println("Xe đạp: ");
        p2.batDau();
        p2.tangToc();
        p2.dungLai();
        System.out.println(p2.layTenHangSanXuat());
        System.out.println(p2.layVanToc());
    }
}
