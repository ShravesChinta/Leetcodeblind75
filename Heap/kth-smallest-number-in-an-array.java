/*** 
Given an array and a number K where K is smaller than the size of the array. Find the K’th smallest element in the given array. Given that all array elements are distinct.

Examples:  

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7

***/

class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
      for(int a:nums)
      {
          pq.add(a);
          if(pq.size()>k)
          {
              pq.remove();
          }

      }
      return pq.remove();
    }
}
