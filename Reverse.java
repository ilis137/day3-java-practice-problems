package PracticeProblem;

public class Reverse {
  public void printReverse(int[] arr){
    
    for(int i=arr.length-1;i>=0;i--){
       System.out.print(" "+arr[i]);
    }
  }
  public static void main(String[] args) {
    int[] array = { 12, 17, 9, 3, 37, 7, 12 };
    Reverse obj = new Reverse();
    obj.printReverse(array);
  }
}