/***

Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.

***/

class Solution {
    public int[] sortArray(int[] nums) {
     int start=0;
     int end=nums.length-1;
     mergeSortDivide(nums, start, end); 
     return nums;  
    }

    public static void mergeSortDivide(int[] nums,int start, int end)
    {
        int mid=start+(end-start)/2;
        if(start<end)
        {
            mergeSortDivide(nums, start, mid);
            mergeSortDivide(nums, mid+1, end);

            mergeArray(nums, start, mid, end);
        }
    }

    public static void mergeArray(int[] array, int start, int mid, int end)
    {
        int l1=mid-start+1;
        int l2=end-mid;

        int[] l=new int[l1];
        int[] r=new int[l2];

        for(int i=0;i<l1;i++)
        {
            l[i]=array[start+i];
        }

        for(int i=0;i<l2;i++)
        {
            r[i]=array[mid+i+1];
        }

        int i=0,j=0,k=start;
        while(i<l1 & j<l2)
        {
            if(l[i]<=r[j])
            {
                array[k++]=l[i++];
            }
            else
            {
                array[k++]=r[j++];
            }
        }
        while(i<l1)
        {
            array[k++]=l[i++];
        }

        while(j<l2)
        {
            array[k++]=r[j++];
        }
         
    }
}
