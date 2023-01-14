package PartIIOOP.Lesson55;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {2, 1, 9, 8, 4, 3, 7, 6};
        int[] b = new int[10];

        //Hàm sắp xếp tăng dần
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //Hàm tìm kiếm trong mảng
        System.out.println(Arrays.binarySearch(a, 6));
        System.out.println(Arrays.binarySearch(a, 0));

        //Hàm fill vào mảng
        Arrays.fill(b, 5);
        System.out.println(Arrays.toString(b));

        //Hàm sắp xếp giảm dần
        System.out.println(Arrays.toString(a));
        a = reverce(a);
        System.out.println(Arrays.toString(a));
    }

    private static int[] reverce(int[] a) {
        int[] rs = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            rs[j++] = a[i];
        }
        return rs;
    }
}
