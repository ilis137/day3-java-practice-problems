package PracticeProblem;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

  public void findFrequency(int[] arr) {
    HashMap<Integer, Integer> freqMap = new HashMap<>();

    for (int num : arr) {
      if (freqMap.containsKey(num)) {
        freqMap.put(num, freqMap.get(num) + 1);
      } else {
        freqMap.put(num, 1);
      }
    }

    for (Map.Entry<Integer, Integer> mapping : freqMap.entrySet()) {
      System.out.println("number of times " + mapping.getKey() + " is " + mapping.getValue());
    }
  }

  public static void main(String[] args) {
    int[] array = { 12, 17, 9, 3, 37, 7, 12, 17, 5, 14, 9, 9, 14, 11 };
    Frequency obj = new Frequency();
    obj.findFrequency(array);
  }
}
