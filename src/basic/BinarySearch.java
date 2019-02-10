package basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo +  (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = {1, 2, 3, 4, 5, 6, 56,22, 23, 12, 78, 288, 65};
        Arrays.sort(whitelist);

        if (rank(65, whitelist) != -1) System.out.println("Значение есть в списке");
        else System.out.println("Значения нет в списке");

    }
}
