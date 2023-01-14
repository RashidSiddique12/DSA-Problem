package Sorting;
//https://leetcode.com/problems/merge-sorted-array/description/

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0 && n>0){
            for(int i=0; i<n; i++){
                nums1[i] = nums2[i];
            }
        }
        else{
            int temp[] = new int[m+n];
            int mi=0;
            int ni=0;
            int k=0;

            while(mi< m && ni <n){
                if(nums1[mi] <= nums2[ni]){
                    temp[k++] = nums1[mi++];
                }
                else{
                    temp[k++] = nums2[ni++];
                }
            }

            while(mi<m){
                temp[k++] = nums1[mi++];
            }
            while(ni<n){
                temp[k++] = nums2[ni++];
            }

            for(int i=0; i<temp.length; i++){
                nums1[i] = temp[i];
            }

        }
        
    }
}