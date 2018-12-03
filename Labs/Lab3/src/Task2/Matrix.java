package Task2;

import java.util.Arrays;

public class Matrix {
  private int[][] matrix;
  Matrix(int[][] matrix) {
    if (!this.isValid(matrix)) throw new IllegalArgumentException("array is not valid matrix");
    this.matrix = matrix;
  }
  Matrix(int rows, int columns) {
    if (rows < 0) throw new IllegalArgumentException("rows number must be positive!");
    if (columns < 0) throw new IllegalArgumentException("columns number must be positive!");
    this.matrix = new int[rows][columns];
  }
  Matrix(int size) {
    if (size < 0) throw new IllegalArgumentException("size must be positive!");
    this.matrix = new int[size][size];
  }
  private boolean isValid(int[][] matrix) {
    if (matrix == null) return false;
    int rowsNumber = matrix.length;
    if (rowsNumber == 0) return false;
    int columnsSize = matrix[0].length;
    for (int index = 0; index < rowsNumber; index++) {
      int[] column = matrix[index];
      if (column.length != columnsSize) return false;
    }
    return true;
  }
  public int[][] getMatrix() {
    return this.matrix;
  }
  public void setMatrix(int[][] matrix) {
    if (!this.isValid(matrix)) throw new IllegalArgumentException("array is not valid matrix");
    this.matrix = matrix;
  }
  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (!(object instanceof Matrix)) return false;
    Matrix matrix = (Matrix) object;
    return Arrays.equals(this.getMatrix(), matrix.getMatrix());
  }
  @Override
  public int hashCode() {
    return Arrays.hashCode(this.getMatrix());
  }
  @Override
  public String toString() {
    StringBuilder string = new StringBuilder("Matrix [\n");
    int rowsNumber = this.getMatrix().length;
    int columnsNumber = this.getMatrix()[0].length;
    for (int i = 0; i < rowsNumber; i++) {
      string.append("\t[ ");
      for (int j = 0; j < columnsNumber; j++) {
        int value = this.getMatrix()[i][j];
        string.append(value);
        if (j < columnsNumber - 1) string.append(", ");
      }
      string.append(" ]\n");
    }
    string.append("]");
    return string.toString();
  }
  public static void main (String[] args) {
    Matrix fourByFourMatrix = new Matrix(new int[][] {
        {1, 3, 4, 5},
        {8, 1, 9, 10},
        {2, 1, 4, 19},
        {2, 3, 1, 2}
    });
    System.out.println(fourByFourMatrix);
  }
}
