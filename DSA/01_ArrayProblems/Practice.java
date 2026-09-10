//  class Practice{

// static  double getAverage(int[] arr){
//     double sum=0;
// for(int i : arr){
//     sum += i;

// }
// int size = arr.length;
// double avg= sum/size;
// return avg;

// }
            
        
//     public static void main(String[] args) {
        
// int[] arr ={1,5,9,6,2,7,5};
// System.out.println(getAverage(arr));
//     }
// }


class Practice{
    static  double getAverage(int[] arr){
        double sum =0;
        for(int  i : arr){
            sum+= i;
        }
        int size = arr.length;
        double average= sum/size;
        return average;

    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(getAverage(arr));
    }
}



// class Practice{

//     static int multByTten(int[] arr){
    
//        int size= arr.length;
//     int[] newArray = new int[size];
//     for(int i=0; i<size; i++){
//         int element = arr[i];
//         int newElement = element*10;
//           newArray[i]= newElement;

//     }


        

//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,8,9,6};
//         int ans[] = multByTten(arr);
//             for(int i : ans ){
//             System.out.println(i);

//         }
//     }
// }