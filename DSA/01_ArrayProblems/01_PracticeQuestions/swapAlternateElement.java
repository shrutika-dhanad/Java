
public class swapAlternateElement {
    
    public static void main(String[] args) {
        int arr[] ={1,2,4,5,7,8};
    
       for(int i=0; i<arr.length-1 ; i=i+2){

        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;

       }

       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] +" ");
       }
         
  
    }

}