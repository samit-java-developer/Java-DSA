package code.binarysearch.advance;


public class FindPivotElement {
    public static void main(String[] args) {
        int[] arr={5,1,3};
        System.out.println(findPivotElement(arr));
    }

    static int findPivotElement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if ((mid+1<=arr.length-1 && arr[mid]>arr[mid+1])){
                return mid;
            }
            if ((mid-1>=0 && arr[mid-1]>arr[mid])){
                return mid-1;
            }
            if (arr[mid]>arr[start]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
