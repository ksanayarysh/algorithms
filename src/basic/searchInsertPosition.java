package basic;

public class searchInsertPosition {

    public static int rank(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo +  (hi - lo) / 2;
            if (target < nums[mid]) hi = mid - 1;
            else if (target > nums[mid]) lo = mid + 1;
            else return mid;
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        int val = 0;
        System.out.println(rank(a, val));
    }

}
