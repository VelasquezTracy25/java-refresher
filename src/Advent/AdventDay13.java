package Advent;//Given array of integers, remove each kth elemnt from it.

import java.util.ArrayList;
import java.util.List;

 public class AdventDay13 {


     public static void main(String[] args) {
         ArrayList<Integer> nums = new ArrayList<>();
         nums.add(1);
         nums.add(2);
         nums.add(3);
         nums.add(4);
         nums.add(5);
         System.out.println(extractEachKth(nums, 0));


     }

     public static List<Integer> extractEachKth(List<Integer> nums, int index){
         System.out.println(nums);
         nums.remove(index);
     return nums;
     }
}
