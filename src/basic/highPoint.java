package basic;

public class highPoint {

    public int countHigh(int[] a){
        boolean flag = false;
        int sum = 0;
        int len = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i-1])  {
                len = 1;
                flag = true;
            } else if (a[i] == a[i-1] && flag){
                len++;
            } else {
                if (flag) {
                    flag = false;
                    sum = Math.max(sum, len);
                }
            }
        }
        return sum;
    }
}

