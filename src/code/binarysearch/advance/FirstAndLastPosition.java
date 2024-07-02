package code.binarysearch.advance;


public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        System.out.println(findFirstIndex(arr, target));
    }

    static int findFirstIndex(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                while (arr[mid]==target && mid>start){
                    mid=mid-1;
                }
                return mid;
            }
            if (target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    static int findLastIndex(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                while (arr[mid]==target && mid>start){
                    mid=mid-1;
                }
                return mid;
            }
            if (target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
