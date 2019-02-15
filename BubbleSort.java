
public class BubbleSort implements SortingAlgorithm {
  public void sort(int[] Arr) {
    // Loop through each Array
    for (int i = 0; i < Arr.length; i++) {
      for (int j = 0; j < Arr.length - i - 1; j++) {
        if (Arr[j] > Arr[j + 1]) {
          swap(Arr, j, j + 1];
        }
      }
    }
  }
  
  private void swap(int[] Arr, int before, int after) {
    int temp = Arr[before];
    Arr[before] = Arr[after];
    Arr[after] = temp;
  }
}
