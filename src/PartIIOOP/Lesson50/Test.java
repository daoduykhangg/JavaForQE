package PartIIOOP.Lesson50;

public class Test {
    public static void main(String[] args) {
        String s1 = "KhangDao";
        String s2 = "khangdao";
        String s3 = "KhangDao";

        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println("-----------------");
        System.out.println("s1 equalIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalIgnoreCase s3: " + s1.equalsIgnoreCase(s3));


        String sv1 = "Nguyễn Văn A";
        String sv2 = "Nguyễn Văn B";
        String sv3 = "Nguyễn Văn a";
        String sv4 = "Nguyễn Văn";
        System.out.println("sv1.compareTo(sv2) = " + sv1.compareTo(sv2));
        System.out.println("sv1.compareTo(sv3) = " + sv1.compareTo(sv3));
        System.out.println("sv1.compareTo(sv4) = " + sv1.compareTo(sv4));

        String sv5 = "Nguyễn văn a";
        String sv6 = "Nguyễn Văn B";
        String sv7 = "Nguyễn Văn A";
        String sv8 = "Nguyễn Văn";
        System.out.println("sv5.compareToIgnoreCase(sv6) = " + sv5.compareToIgnoreCase(sv6));
        System.out.println("sv5.compareToIgnoreCase(sv7) = " + sv5.compareToIgnoreCase(sv7));
        System.out.println("sv5.compareToIgnoreCase(sv8) = " + sv5.compareToIgnoreCase(sv8));
    }
}
