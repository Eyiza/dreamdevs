package dsa;

public class MagicSquare {
    public static boolean magicSquare(int [][] array){
        if(array.length != array[0].length) throw new IllegalArgumentException("array is not a square matrix");
        int expected_sum = 15;

        for (int[] row : array) {
            int row_sum = 0;
            for (int col : row) {
                row_sum += col;
            }
            // System.out.println(row_sum);
            if (row_sum != expected_sum) return false;
        }

        for(int col=0; col<array.length; col++){
            int col_sum = array[0][col];
            for(int row=1;row<array.length;row++){
                col_sum += array[row][col];
            }
            // System.out.println(col_sum);
            if(col_sum != expected_sum) return false;
        }

        int forward_diagonal_sum = 0;
        int backward_diagonal_sum = 0;
        for(int row=0; row<array.length; row++){
            forward_diagonal_sum += array[row][row];
            backward_diagonal_sum += array[row][array.length-1-row];
        }
        if(forward_diagonal_sum != expected_sum ||  backward_diagonal_sum != expected_sum) return false;

        return true;
    }
}
