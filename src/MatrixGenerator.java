public class MatrixGenerator {
    public static void main(String[] args) {
        int[][] matrix1 = generateMatrix(4, 4, 1);
        printMatrix(matrix1);

        int[][] matrix2 = generateMatrix(6, 6, 2);
        printMatrix(matrix2);

        int[][] matrix3 = generateMatrix(8, 8, 3);
        printMatrix(matrix3);
    }

    public static int[][] generateMatrix(int rows, int cols, int value) {
        int[][] matrix = new int[rows][cols];

        // Установка значений на границах
        for (int i = 0; i < rows; i++) {
            matrix[i][0] = value;
            matrix[i][cols - 1] = value;
        }
        for (int j = 0; j < cols; j++) {
            matrix[0][j] = value;
            matrix[rows - 1][j] = value;
        }

        // Установка внутренних значений в соответствии с шаблоном
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                matrix[i][j] = (value - 1);
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
