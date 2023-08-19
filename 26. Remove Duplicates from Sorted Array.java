class Solution {
    public int removeDuplicates(int[] nums) {
      
        int arr[]=new int[nums.length];
        int i=1,j=1;
        arr[0]=nums[0];
        while(i<nums.length)
        {
             if(nums[i-1]==nums[i]);
                
                 else
                 arr[j++]=nums[i];

                 i++;
        }
        for(int p=0;p<j;p++)
        {
         nums[p]=arr[p]; 
        }
        return j;
    }
}