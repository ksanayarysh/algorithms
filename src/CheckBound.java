import java.util.Arrays;

public class CheckBound {
    public void checkBound(int[] a){
        for (int i : a) {

        }
    }

    public static void invert(){
        int[] change = {0, 1, 0, 1};
        for (int i = 0; i < change.length; i++)
            System.out.print(change[i] + " ");

        System.out.println();

        for (int i = 0; i < change.length; i++) change[i] = Math.abs(change[i] - 1);

        for (int i = 0; i < change.length; i++)
            System.out.print(change[i] + " ");

    }

    public static void main(String[] args) {
        invert();
    }

}
