package PracticeProblem;

public class LargestNum {
  public void findLargestNum(int[] arr){
    int largest=arr[0];
    for(int num:arr){
      if(num>largest)largest=num;
    }
    System.out.println(largest);
  }
  public static void main(String[] args) {
    
   int[] array={12,17,4,1,37,7,12};
   LargestNum obj=new LargestNum();
   obj.findLargestNum(array);
  }
}
