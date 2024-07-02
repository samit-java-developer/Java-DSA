package code.binarysearch.advance;


public class Ceiling {
    public static void main(String[] args) {
        int[] arr={2,5,18,30,38,44};
        int target=45;
        System.out.println(ceilingOfNumber(arr, target));
    }
    // return the number--smallest no greater than equal to target
    static int ceilingOfNumber(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        //but what if my target no is greater than largest element of the array
        if (target>arr[arr.length-1]){
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
        return arr[start];
    }
}
