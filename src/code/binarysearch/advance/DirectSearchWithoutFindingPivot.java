package code.binarysearch.advance;


public class DirectSearchWithoutFindingPivot {
    public static void main(String[] args) {
        int[] arr={4, 5, 6, 7, 8, 9, 1, 2, 3};
        int l=0;
        int h=arr.length-1;
        int key=1;
        System.out.println(search(arr, l, h, key));
    }
    
    static int search(int[] arr, int l,int h,int key){
        if (l>h){
            return -1;
        }
        int mid=l+(h-l)/2;
        if (arr[mid]==key){
            return mid;
        }
        if ((arr[l] == arr[mid]) 
            && (arr[h] == arr[mid]))
        { 
            l++; 
            h--; 
            return search(arr,l,h,key);
        } 
        else if (arr[l]<=arr[mid]){
            if (key>=arr[l] && key<=arr[mid]){
                return search(arr, l, mid-1, key);
            }
            return search(arr, mid+1, h, key);
        }
        else if (key>=arr[mid] && key<=arr[h]){
            return search(arr, mid+1, h, key);
        }
        return search(arr, l, mid-1, key);
    }

}
