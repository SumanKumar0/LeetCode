class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m&&j<n)
        {
            arr[k++]=nums1[i]<nums2[j]?nums1[i++]:nums2[j++];
        }
        while(i<m)
        arr[k++]=nums1[i++];
        while(j<n)
        arr[k++]=nums2[j++];
        for(int p=0;p<arr.length;p++)
        nums1[p]=arr[p];


    }
}