// public class searchElementInArr {
    

//     static boolean findTarget(int arr[],int  target){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == target){
                
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
   
//          int arr[] ={1,8,6,11,9,20};
           
//          boolean result= findTarget(arr, 9);
//   System.out.println(result);

//     }
// }


public class searchElementInArr {


    static boolean searchElement(int arr[] , int target){
        for(int i=0; i<arr.length; i++){
            if(target==arr[i]){
                return  true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[] = {1,5,65,9,63,2};
        boolean result = searchElement(arr, 6);
     System.out.println(result);
    }
}