package code.binarysearch.advance;


public class PeakIndex {

    public static void main(String[] args) {
        System.out.println("Samit Verma");
        int[] arr={0,5,3,1};
        System.out.println(findPeakIndex(arr));
    }

    // static int findPeakIndex(int[] arr) {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         if ((mid + 1 <= arr.length - 1 && arr[mid] > arr[mid + 1]) && (mid - 1 >= 0 && arr[mid] > arr[mid - 1])) {
    //             return mid;
    //         }
    //         if (mid + 1 <= arr.length - 1 && arr[mid]<arr[mid+1]){
    //             start=mid+1;
    //         }else{
    //             end=mid-1;
    //         }
    //     }
    //     return -1;
    // }
    
    
    static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }


   
}
