
    public class sumOfPossiAndNegative {
    
        static int[] sumOfposAndNegative(int arr[]){
            int possSum=0;
            int negSum=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]> 0){
                    possSum +=arr[i];
                }
                else{
                    negSum+=arr[i];
                }
            }
            int ansArr[]={possSum, negSum};
            return ansArr;

        }
        public static void main(String[] args) {
        
            int arr[]={1,8,5,-5,9,6,-5,-9};
             int ans[]= sumOfposAndNegative(arr);
             System.out.println("possitive array :" + ans[0]);
             System.out.println("negative array :" + ans[1]);

        }
    }
