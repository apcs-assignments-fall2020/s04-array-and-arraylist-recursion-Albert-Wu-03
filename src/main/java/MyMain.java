import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if(i == list.size()-1){
            return true;
        }else if(list.get(i) > list.get(i+1)){
            return false;
        }else{
            return isSortedRec(list, i+1);
        }
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        if(count < 0){
            return false;
        }else if(i == arr.length){
            if(count == 0){
                return true;
            }
            return false;
        }else if(arr[i] == x){
            return hasCountCopiesRec(arr, x, count-1, i+1);
        }else{
            return hasCountCopiesRec(arr, x, count, i+1);
        }
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length-1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        if(upperBound == lowerBound){
            return false;
        }else if(arr[lowerBound + (upperBound - lowerBound) / 2] == num){
            return true;
        }else if(arr[lowerBound + (upperBound - lowerBound) / 2] < num){
            return binarySearchRec(arr, num, (lowerBound + (upperBound - lowerBound) / 2) + 1, upperBound);
        }else{
            return binarySearchRec(arr, num, lowerBound, (lowerBound + (upperBound - lowerBound) / 2) -1);
        } 
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
