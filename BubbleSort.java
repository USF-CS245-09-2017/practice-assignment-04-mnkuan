
public class BubbleSort implements SortingAlgorithm {
  public void sort(int[] arr) {
    // Loop through each Array
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1];
        }
      }
    }
  }

  // Swaps the values of two indexes of an array
  private void swap(int[] arr, int before, int after) {
    int temp = arr[before];
    arr[before] = arr[after];
    arr[after] = temp;
  }
}
