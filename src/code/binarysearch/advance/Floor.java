package code.binarysearch.advance;


public class Floor {
    public static void main(String[] args) {
        int[] arr={2,5,18,30,38,44};
        int target=1;
        System.out.println(floorOfNumber(arr, target));
    }
    // return the number--greatest no less than equal to target
    static int floorOfNumber(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        if (target<arr[0]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return arr[mid];
            }
            if (target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return arr[end];
    }
}
