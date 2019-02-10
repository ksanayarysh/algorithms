package basic;// Функция выводит результат перемножения двух матриц

public class one_four_18 {

    public static int[][] multiply(int a[][], int[][] b) {
        int bRowCount = b.length;
        int c[] = a[0];
        int aRowCount = c.length;

        int mulRows = a.length;
        c = b[0];
        int mulCols = c.length;


        if (bRowCount != aRowCount) {
            return null;
        }

        int[][] multiply = new int[mulRows][mulCols];

        for (int i = 0; i < mulRows; i++) {
            for (int j = 0; j < mulCols; j++) {
                int sum = 0;
                for (int k = 0; k < aRowCount; k++) {
                    sum = sum + a[i][k] * b[k][j];
                }
                multiply[i][j] = sum;
            }
        }

        for (int i = 0; i < mulRows; i++) {
            for (int j = 0; j < mulCols; j++) {
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();

        }
        return multiply;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 5, 7, 9, 11}, {2, 5, 8, 4, 7}};
        int[][] b = {{1, 8}, {5, 4}, {7, 1}, {2, 2}, {1, 0}};

        if (multiply(a, b) == null) System.out.println("Не совпадает размерность массива!");

    }
}
