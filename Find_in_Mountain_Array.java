/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
     int peak=findingPeak(arr,0, arr.length);
      int index= binarySearch(arr,0, peak, target);
      if(index==-1)
          index=binarySearch(arr, peak, target);
    }
    
    int findingPeak(int[] arr, int start, int end)
    {
        while(start<end)
         {
            int mid=start+(end-start)/2;
            if(start==end)
                return start;
            else if(arr[mid]>arr[mid+1])
                  end=mid;
            else 
                start=mid+1;
        }
        return -1;
    }
    int binarySearch(int arr[], int start, int end, int target)
    {
        boolean is
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
              return mid;
            else if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}
