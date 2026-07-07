
public class TwoDimArr {
    
    public static void main(String[] args) {
        
//         //2D arrays : arrays of an array.
//         int arr[][];  //dec
//         arr=new int [3][3];  //allocation 
          
//         int [][] brr={
//             {1,2,3},
//             {4,5,6},
//             {7,8,9},
             
//         };

//         int n=brr.length;
//         int m= brr[0].length;  //because row and col size is same that why we can take brr[0].length;
//         for(int i=0; i<=n-1; i++){
//             for(int j=0; j<=m-1; j++){
//            //     System.out.print( brr[i][j] + " ");
//             }
//           //  System.out.println();
//         }



//         int newArr[][]= {
//             {1,2,3},
//             {4,8},
//             {7,9,3,8,5,44},
//             {4},
//         };
//         int x= newArr.length;

//         for(int i=0; i<=x-1; i++){
//           int y= newArr[i].length;
//           for(int j=0; j<=y-1; j++){
//       //      System.out.print(newArr[i][j]+ " ");
//           }
//      //     System.out.println();
//         }

    
// int twodArr[][]={
//     {51,75,23},
//     {4,85,96,32,47,7},
//     {74,52},

//     };
   
//     for(int i=0; i<=twodArr.length-1; i++){
//       for(int j=0; j<=twodArr[i].length-1; j++){

//      //   System.out.print(twodArr[i][j] + " ");
//       }
//       System.out.println();
//     }


//     // accesssing element in 2D array;

//     int newArray[][]={

//         {1,2,3,4},
//         {5,6,7,8},
//     };
//      for(int i=0; i<=newArray.length-1; i++){
//         for(int j=0; j<=newArray[i].length-1; j++){   
//      }
//     }
//      //    System.out.println(newArr[1][1]);



//          // Takes input in 2D Array;


//          int array[][]= new int[3][4];
//         Scanner sc = new Scanner(System.in);

//         for(int i=0; i< array.length; i++){
//          for(int j=0; j<array[i].length; j++){
//           //  System.out.println("provide value for row =" +  i + " and column =  " + j);
//              array[i][j]=sc.nextInt();
//          }

//         }
//         for(int i=0; i< array.length; i++){
//          for(int j=0; j<array[i].length; j++){
//        //      System.out.print(array[i][j] + " ");
//         }
//           System.out.println();
//         }

        

 //sum of 2d array

 int sumArr[][]={
     {1,2,2},
     {5,8,6},
 };

 int sum=0;
 for(int i=0; i<sumArr.length; i++){
    for(int j=0; j<sumArr[i].length; j++){
        int value= sumArr[i][j];
        sum = sum + value;


    }
 }

 //System.out.println(sum);



 int addArr[][]={

  {1,5,8,3,0},
  {1,85,96,},
  {7,5,2},
  {5,5},
 };

 int res= 0;
 for(int i=0; i < addArr.length; i++){
     for(int j=0; j < addArr[i].length; j++){
      int val = addArr[i][j];
       res += val;

     }
 }

 System.out.println(res);


 // mult 


 int multArr[][]= {{10,20,20},{40,2,1}};

 int start = 1;
 for(int i=0 ; i< multArr.length; i++){
    for(int j=0; j<multArr[i].length; j++){
        int myValue= multArr[i][j];
        start=start*myValue;
    }
 }

 System.out.println(start);



 //maximum value

int maxArr[][]={
    {10,522,741,962,1,0},
    {-1,85,-9,852,0}
};
int maxValue=maxArr[0][0];
for(int i =0; i< maxArr.length; i++){
    for(int j=0; j< maxArr[i].length;  j++){
     if(maxArr[i][j] > maxValue){
   
       maxValue= maxArr[i][j];    
    }

    }
}
System.out.println( "maxvalue is ; " +maxValue);



int minArr[][]={
    {10,522,741,962,1,0},
    {-1,85,-9,852,0}
};
int minValue=minArr[0][0];
for(int i =0; i< minArr.length; i++){
    for(int j=0; j< minArr[i].length;  j++){
     if(minArr[i][j] < minValue){
   
       minValue= minArr[i][j];    
    }

    }
}
System.out.println( "minvalue is :" +minValue);



}
}
