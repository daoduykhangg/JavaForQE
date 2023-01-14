package PartIIOOP.Lesson52;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        String s1 = "Khang ";
        String s2 = "Đào";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        String s4  = s3.replace("Đà", "Da");
        System.out.println(s4);

        String s5 = s4.toLowerCase();
        String s6 = s4.toUpperCase();
        System.out.println(s5);
        System.out.println(s6);

        String s7 = s1.trim();
        System.out.println(s7);

        String s8 = s3.substring(6);
        System.out.println(s8);

        String s9 = "Khang@Đào@Duy";
        String[] arr = s9.split("@",2);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
