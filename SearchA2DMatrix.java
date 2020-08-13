
public class SearchA2DMatrix {
	public static void main(String[] args) throws Exception {
        int[][] matrix =
                {
                        {1, 3, 5, 7, 9},     //1, 3, 5, 7, 9
                        {2, 4, 6, 8, 10},     //2, 4, 6, 8, 10
                        {11, 13, 15, 17, 19}, //11, 15, 17, 18, 19
                        {12, 14, 16, 18, 20}, //13, 20, 21, 22, 23
                        {21, 22, 23, 24, 25}  //14, 25, 26, 27, 28
                };

        System.out.println(new SearchA2DMatrix().searchMatrix(matrix, 9));
    }
	
	public boolean searchMatrix(int[][] matrix, int target) {
        // start our "pointer" in the bottom-left
        int row = matrix.length-1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) {
                row--;
            } else if (matrix[row][col] < target) {
                col++;
            } else { // found it
                return true;
            }
        }

        return false;
    }
}
