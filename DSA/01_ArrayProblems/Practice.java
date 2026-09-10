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


// class Practice{
//     static  double getAverage(int[] arr){
//         double sum =0;
//         for(int  i : arr){
//             sum+= i;
//         }
//         int size = arr.length;
//         double average= sum/size;
//         return average;

//     }
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50};
//         System.out.println(getAverage(arr));
//     }
// }





public class Practice {

    static  int[] multiplyByTen(int[] arr){
        int size=  arr.length;
        int[] newArr= new int[size];
     for(int i=0; i<size; i++){
        int element= arr[i];
        int newElement = element*10;
         newArr[i] = newElement;
     }
     return  newArr;

    }
    public static void main(String[] args) {
        int[] arr= {10,20,30,40};
        int answer[] = multiplyByTen(arr);
        for(int i : answer){
            System.out.println("answer : " +i);
        }
    }
}