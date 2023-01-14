package PartIIOOP.Lesson53;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int mang1[] = new int[]{1, 2, 3};

        //Copy cach 1 by =
        int[] mang1_a = mang1;
        mang1_a[0] = 100;
        System.out.println(Arrays.toString(mang1));
        System.out.println(Arrays.toString(mang1_a));

        // Copy cach 2 by clone
        int[] mang1_b = mang1.clone();
        mang1_b[0] = 50;
        System.out.println(Arrays.toString(mang1));
        System.out.println(Arrays.toString(mang1_b));

        //Copy cach 3 by System.arraycopy
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
        mang1_c[0] = 21;
        System.out.println(Arrays.toString(mang1));
        System.out.println(Arrays.toString(mang1_c));
    }
}
