
public class SelectionSort implements SortingAlgorithm {
  public void sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      swap(arr, i, findSmallest(arr, i));
    }
  }

  // Returns the index of the smallest value in the array
  private int findSmallest(int[] arr, int starting) {
    int smallest = starting;

    for (int i = starting + 1; i < arr.length; i++) {
      if (arr[smallest] > arr[i]) {
        smallest = i;
      }
    }

    return smallest;
  }

  // Swaps the values of two indexes of an array
  private void swap(int[] arr, int before, int after) {
    int temp = arr[before];
    arr[before] = arr[after];
    arr[after] = temp;
  }
}
