
//tc- O(n)  and Sc- O(1);

public class Three_searchAnElementInArr {
    
    static boolean findTargetElement(int[] arr , int target){

         for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return true;
            }
         }
         return false;

    }


public static void main(String[] args) {
 
    int[] arr ={1,8,5,9,6};
    // boolean ans = findTargetElement(arr, 6);
    boolean ans = findTargetElement(arr,906);
    System.out.println(ans);

}
}
