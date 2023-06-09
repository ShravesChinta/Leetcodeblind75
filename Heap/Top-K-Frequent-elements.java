/***
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]

***/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map=new HashMap<>();
    PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->Integer.compare(map.get(a),map.get(b)));
    int[] result=new int[k];
    for(int a:nums)
    {
        map.put(a,map.getOrDefault(a,0)+1);
    }

    for(int a:map.keySet())
    {
        pq.add(a);
        if(pq.size()>k)
        {
            pq.remove();
        }
    }
    for(int i=0;i<k;i++)
    {   
        result[i]=pq.remove();
    }
    return result;

    }
}
