package PracticeProblem;

public class SecondLargest {

  public void findSecondLargest(int[] arr) {
    int first, second;
    first = second = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > first) {
        second = first;
        first = arr[i];
      }

      if (arr[i] > second && arr[i] < first)
        second = arr[i];
    }
    System.out.println("Second largest number is: " + second);
  }

  public static void main(String[] args) {
    int[] array = { 12, 17, 9, 3, 37, 7, 12 };
    SecondLargest obj = new SecondLargest();
    obj.findSecondLargest(array);
  }

}
