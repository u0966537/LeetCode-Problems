package lc12272020;

public class SearchA2DMatrix {

  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0)
      return false;

    int col = matrix[0].length, row = matrix.length;
    int start = 0, end = col * row - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      int value = matrix[mid / col][mid % col];
      if (value == target) {
        return true;
      } else if (value < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return false;
  }
}