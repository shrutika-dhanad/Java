//O(n) - time complexity and O(1) - is space complexity.

public class One_Avg_of_Arr_Elements {
    static  double getAvg(int[] arr){
    double sum=0;
    for(int i : arr){
        sum += i;

    }
    
    int size = arr.length;
    double avg =sum /size;
    return  avg;
 }
    public static void main(String[] args) {
        int arr[]={1,9,6,3,8,1,4};
      System.out.println(getAvg(arr));


    }
    
}
