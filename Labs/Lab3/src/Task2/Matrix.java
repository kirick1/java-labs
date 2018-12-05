package Task2;

import java.util.Arrays;

public class Matrix {
  private int[][] matrix;
  Matrix(int[][] matrix) {
    if (!this.isValid(matrix)) throw new IllegalArgumentException("array is not valid matrix");
    this.matrix = matrix;
  }
  Matrix(int size) {
    assert size >= 0 : "size must be positive!";
    this.matrix = new int[size][size];
  }
  Matrix(int rows, int columns) {
    assert rows >= 0 : "rows number must be positive!";
    assert columns >= 0 : "columns number must be positive!";
    this.matrix = new int[rows][columns];
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
  private int[][] getMatrix() {
    return this.matrix;
  }
  public void setMatrix(int[][] matrix) {
    if (!this.isValid(matrix)) throw new IllegalArgumentException("array is not valid matrix");
    this.matrix = matrix;
  }
  private int getRowsNumber() {
    return this.getMatrix().length;
  }
  private int getColumnsNumber() {
    if (this.getRowsNumber() == 0) return 0;
    return this.getMatrix()[0].length;
  }
  private int getMaxInColumn(int column) {
    assert column >= 0 && column <= this.getColumnsNumber() : "value must be in range between!";
    int maxRow = 0;
    int max = this.getMatrix()[maxRow][column];
    for (int index = 0; index < this.getRowsNumber(); index++) {
      int[] row = this.getMatrix()[index];
      int current = row[column];
      if (current > max) {
        max = current;
        maxRow = index;
      }
    }
    return maxRow;
  }
  private int getMinInColumn(int column) {
    assert column >= 0 && column <= this.getColumnsNumber() : "value must be in range between!";
    int minRow = 0;
    int min = this.getMatrix()[minRow][column];
    for (int index = 0; index < this.getRowsNumber(); index++) {
      int[] row = this.matrix[index];
      int current = row[column];
      if (current < min) {
        min = current;
        minRow = index;
      }
    }
    return minRow;
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
    StringBuilder string = new StringBuilder("[");
    int rowsNumber = this.getMatrix().length;
    int columnsNumber = this.getMatrix()[0].length;
    for (int i = 0; i < rowsNumber; i++) {
      string.append("[ ");
      for (int j = 0; j < columnsNumber; j++) {
        int value = this.getMatrix()[i][j];
        string.append(value);
        if (j < columnsNumber - 1) string.append(", ");
      }
      string.append(" ]");
      if (i < rowsNumber - 1) string.append('\n');
    }
    string.append("]\n");
    return string.toString();
  }
  private void replaceMaxAndMinInColumn(int column) {
    assert column >= 0 && column <= this.getColumnsNumber() : "value must be in range between!";
    int maxRow = this.getMaxInColumn(column);
    int max = this.getMatrix()[maxRow][column];
    int minRow = this.getMinInColumn(column);
    int min = this.getMatrix()[minRow][column];
    this.matrix[maxRow][column] = min;
    this.matrix[minRow][column] = max;
  }
  private boolean isValidToMultiply() {
    return this.getRowsNumber() == this.getColumnsNumber();
  }
  private void multiply(Matrix matrix) {
    if (!this.isValid(matrix.getMatrix())) throw new IllegalArgumentException("multiplier matrix is not valid!");
    int currentColumns = this.getColumnsNumber();
    int multiplierRows = matrix.getRowsNumber();
    if (currentColumns != multiplierRows) throw new IllegalArgumentException("multiplier matrix rows number must be equal with current matrix columns number!");
    int currentRows = this.getRowsNumber();
    int multiplierColumns = matrix.getColumnsNumber();
    int[][] tmp = new int[currentRows][multiplierColumns];
    for (int i = 0; i < currentRows; i++) {
      for (int j = 0; j < multiplierColumns; j++) {
        for (int k = 0; k < currentColumns; k++) {
          int current = this.getMatrix()[i][k];
          int multiplier = matrix.getMatrix()[k][j];
          tmp[i][j] += current * multiplier;
        }
      }
    }
    this.matrix = tmp;
  }
  private void square() {
    Matrix current = new Matrix(this.getMatrix());
    this.multiply(current);
  }
  public static void main (String[] args) {
    System.out.println("Matrix1:");
    Matrix matrix1 = new Matrix(new int[][] {
        {33,34,12},
        {33,19,10},
        {12,14,17},
        {84,24,51},
        {43,71,21}
    });
    System.out.println(matrix1);
    System.out.println("Matrix2:");
    Matrix matrix2 = new Matrix(new int[][] {
        {10,11,34,55},
        {33,45,17,81},
        {45,63,12,16}
    });
    System.out.println(matrix2);
    System.out.println("Matrix3:");
    Matrix matrix3 = new Matrix(new int[][] {
        {1, 3, 4, 5},
        {8, 1, 9, 10},
        {2, 1, 4, 19},
        {2, 3, 1, 2}
    });
    System.out.println(matrix3);
    System.out.println("Matrices:");
    Matrix[] matrices1 = new Matrix[] { matrix1, matrix2, matrix3 };
    System.out.println(Arrays.toString(matrices1));
    System.out.println("Replaced max and min:");
    for (Matrix matrix : matrices1) matrix.replaceMaxAndMinInColumn(1);
    System.out.println(Arrays.toString(matrices1));
    Matrix[] matrices2 = new Matrix[] { matrix1, matrix2, matrix3 };
    System.out.println("Square:");
    for (Matrix matrix : matrices2) if (matrix.isValidToMultiply()) matrix.square();
    System.out.println(Arrays.toString(matrices2));
  }
}
