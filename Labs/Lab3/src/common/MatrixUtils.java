package common;

import java.util.Arrays;

public class MatrixUtils {
  public static int[][] copy(int[][] src) {
    int[][] tmp = new int[src.length][];
    for (int index = 0; index < src.length; index++) tmp[index] = Arrays.copyOf(src[index], src[index].length);
    return tmp;
  }
}
