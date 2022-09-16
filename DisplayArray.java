package PracticeProblem;

public class DisplayArray {
  public void displayArray(int[] arr) {
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  public static void main(String[] args) {
    int[] array = { 5, 1, 6, 23, 12 };
    DisplayArray obj = new DisplayArray();
    obj.displayArray(array);
  }
}
