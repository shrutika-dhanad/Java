// public class maxElement {

//     static int getMaximumNumber(int[] arr){
//         int maxElement = arr[0];
//         for(int i=0; i<arr.length; i++){
//             if(arr[0] > maxElement){
//                 maxElement=arr[0];
//             }
//         } 
//         return maxElement;
//     }
//     public static void main(String[] args) {
//         int arr[]={ 4, 8, 6, 92, 74 };
//        System.out.println(getMaximumNumber(arr));
//     }
// }

public class maxElement {

    public static void main(String[] args) {
        int arr[]={12,8,5,69,96,1};

        int max= arr[0];
        for(int i=0; i<arr.length; i++){
            max= Math.max(max, arr[i]);

        }
        System.out.println(max);
    }
}