/***
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
***/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length<3)
        return -1;
        int min_diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                int diff=Math.abs(target-sum);

                if(diff==0)
                return target;

                if(diff<min_diff)
                {
                    min_diff=diff;
                    result=sum;
                }
                if(sum<target)
                {
                    j++;
                }
                else
                {
                    k--;
                }

            }

        }
        return result;
    }
}
