package PracticeProblem;

public class SmallestNum {
  public void findSmallestNum(int[] arr) {
    int smallest = arr[0];
    for (int num : arr) {
      if (num < smallest)
        smallest = num;
    }
    System.out.println(smallest);
  }

  public static void main(String[] args) {

    int[] array = { 12, 17, 9, 3, 37, 7, 12 };
    SmallestNum obj = new SmallestNum();
    obj.findSmallestNum(array);
  } 
}
