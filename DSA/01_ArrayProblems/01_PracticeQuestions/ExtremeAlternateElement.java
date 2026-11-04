

//         public class ExtremeAlternateElement {
//     public static void main(String[] args) {

//         int[] arr = {10, 20, 30, 40, 50, 60};

//         int start = 0;
//         int end = arr.length - 1;

//         while (start <= end) {

//             System.out.print(arr[start] + " ");
//             start++;

//             if (start <= end) {
//                 System.out.print(arr[end] + " ");
//                 end--;
//             }
//         }
//     }
// }
    


public class ExtremeAlternateElement {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int start=0; int end=arr.length-1;

        while(start<=end){
            System.out.print(arr[start] + " ");
            start++;

            if(start<=end){
                System.out.println(arr[end]+ " ");
                end--;

            }
        }
    }
}