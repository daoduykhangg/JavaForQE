package PartIIOOP.Lesson46;

public class Test {
    public static void main(String[] args) {
        System.out.println("Test câu a: ");
        MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
        MayTinhVinacal500 mvn500 = new MayTinhVinacal500();

        System.out.println("5+3=" + mfx500.cong(5, 3));
        System.out.println("5+3=" + mvn500.cong(5, 3));
        System.out.println("5/0=" + mvn500.chia(5, 0));

        System.out.println("Test câu b: ");
        double arr[] = new double[]{5, 1, 7, 2, 8, 4, 2};
        double arr2[] = new double[]{5, 1, 7, 3, 6, 8, 4, 2};

        SapXepChen sxc = new SapXepChen();
        SapXepChon sxch = new SapXepChon();

        sxc.sapXepGiam(arr);
        for (double v : arr) {
            System.out.print(v + "\t\t");
        }
        System.out.println("");
        sxch.sapXepTang(arr2);
        for (double v : arr2) {
            System.out.print(v + "\t\t");
        }


        System.out.println("\nTest câu c: ");
        double arr3[] = new double[]{9, 1, 7, 3, 6, 0, 4, 2};
        PhanMemMayTinh pmmt = new PhanMemMayTinh();
        pmmt.sapXepTang(arr3);
        for (double v : arr3) {
            System.out.print(v + "\t\t");
        }
    }
}
