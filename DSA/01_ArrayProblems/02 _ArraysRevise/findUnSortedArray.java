public class findUnSortedArray {


    static int getunsortedElement(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i+1]<=arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={ 1,2,3,4,8,5};
        System.out.println(getunsortedElement(arr));
    }
}