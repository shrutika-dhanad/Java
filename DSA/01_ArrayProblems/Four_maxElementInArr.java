
//tc- o(n) and sc- O(1)
public class Four_maxElementInArr {

    static int findMax(int[]arr){
        int size = arr.length;
        int maxi=arr[0];
        for(int i=0; i<size; i++){
             if(arr[i]> maxi){
                maxi = arr[i];
               
             }
        }
        return maxi;

    }

    public static void main(String[] args) {
        int[]arr ={1,8,6,3,5,9,74};
        System.out.println("maximum element is : ");
        System.out.println(findMax(arr));
    }
}
