package code.binarysearch.advance;


public class FindPivotElementInDuplicate {
    public static void main(String[] args) {
        int[] arr={1,3};
        int pivot=findPivotWithDuplicates(arr);
        int target=1;
        if (pivot==-1){
            System.out.println(binarySearch(arr, 0, arr.length-1, target));
        }else{
            boolean result=binarySearch(arr, 0, pivot,target);
            if (!result){
                System.out.println(binarySearch(arr, pivot+1,arr.length-1,target)); 
            }else{
                System.out.println(result);
            }
        }
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    static boolean binarySearch(int[] arr, int start, int end, int target){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                System.out.println("target index of 0 is "+mid);
                return true;
            }
            if (target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}
