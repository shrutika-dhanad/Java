public class countnumberOfZerosAndOnes {


    static int[] countOneAnZeros(int[] arr){

        int zero=0;
        int one=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== 0){
                zero++;
            }else{
                one++;
            }
            
            
        }
    
        int newArr[] ={ zero, one};
            return  newArr;
        }
    
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1};
         int answer[] = countOneAnZeros(arr);
         System.out.println("Zerros :" + answer[0]);
         System.out.println("one : " + answer[1]);
    } 
    
}
