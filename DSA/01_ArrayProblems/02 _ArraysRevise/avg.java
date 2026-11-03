// average element inside the Array

public class avg {

static double getAvgElement(int[] arr){

double sum =0;
for(int i : arr){
    sum = sum+i;

}
int size=arr.length;
double average=sum/size;


    return  average;
     
}

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
  System.out.println(getAvgElement(arr));
    }
}