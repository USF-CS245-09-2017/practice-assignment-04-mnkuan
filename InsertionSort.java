
public class InsertionSort implements SortingAlgorithm {

  public void sort(int[] arr) {

  }

  // Swaps the values of two indexes of an array
  private void swap(int[] arr, int before, int after) {
    int temp = arr[before];
    arr[before] = arr[after];
    arr[after] = temp;
  }
}
