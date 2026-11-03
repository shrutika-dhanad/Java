public  class mutliplyEachElementByTen {


    static int[] multiplyByTen(int[] arr){
        int size= arr.length;
        int newArray[] = new int[size];
     for(int i=0; i<size; i++){
        int element  = arr[i];
        int newElement = element * 10 ;
        newArray[i]=newElement;
     }
     return  newArray;
    }


    public static void main(String[] args) {
        int arr[] = {2,5,9,6};
  int answer[] = multiplyByTen(arr);
  System.out.println("printing ans Arrays :");

  for(int result : answer){
    System.out.println(result);
  }

    }
}