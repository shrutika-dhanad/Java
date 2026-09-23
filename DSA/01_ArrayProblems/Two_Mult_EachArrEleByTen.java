public class Two_Mult_EachArrEleByTen {

    static int[] multiplyBy10(int[] arr){
        int size= arr.length;
        int newArray[] = new int[size];
        for(int i=0; i<size; i++){
         int element = arr[i];
         int newElement = element * 10;
         newArray[i] = newElement;

        }
        return newArray;

    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,6,3,4};
        int ans[] = multiplyBy10(arr);

        System.out.println("printing ans array : -");

        for(int i : ans ){
            System.out.println(i);
        }

    }
}
