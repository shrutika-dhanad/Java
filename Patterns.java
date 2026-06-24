public class Patterns {
    
    public static void main(String[] args) {
        // int n=4;
        // for(int row=1; row<=n ; row++){
        //      for(int col=1; col<=4; col++){
        //         System.out.print("* ");
        //      }
        //      System.out.println();
        // }

//solid rectangle

// int n =5;
// for(int i=1 ; i<=n; i++){
//     for(int j=1; j<=n; j++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }



// int n=10;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }


    //rhombus..
//   int n = 4;;
//   for(int row=1; row<=n; row++){   //1<=4 -> 
//      //space
//      for(int col=1; col<=n-row; col++){   //1<=4-1=1<=3
//         System.out.print(" ");
//      }
//      for(int col=1; col<=n; col++){
//         System.out.print("* ");
//      }
//     System.out.println();
//   }



// int n=5; 
// for(int row=1; row<=n; row++){
//      for(int col=1; col<=n-row+1; col++){
            
//         System.out.print("* ");

//      } 
     
//   System.out.println();
// }




// int n=10;
//  for(int row=1; row<=n; row++){
//      for(int col=1; col<=n-row; col++){
//         System.out.print(" ");
//      }
//      for(int col=1; col<=2*row-1; col++){
//         System.out.print(" *   ");
//      }
//      System.out.println();
//  }


//  int n=4;
//  for(int row=1; row<=n; row++){
//     for(int col=1; col<=row-1; col++){

//         System.out.print(" ");
//     }
//     for(int col=1; col<=2*n-2*row+1; col++){
//         System.out.print("* ");
//     }
//     System.out.println();
//  }



//hollow rect


// int n =4; 
// for(int row=1; row<=n; row++){
//     for(int col=1; col<=6; col++){

//         if(row==1 || row==n){
//             System.out.print("* ");
//         }
//         else{
//             if(col==1 || col==6){
//                 System.out.print("* ");
//             }
//             else{
//                 System.out.print("  ");
//             }
//         }
        
//     }
//     System.out.println();
    
// }



//..........not understand to much ..... ''
// int n=10;
// for(int row=1; row<=n; row++){
// if(row==1 || row==2 || row==n){
//  for(int col=1; col<=row ; col++)
//     {
//     System.out.print("* ");
// }
// }
// else{
//     System.out.print("* ");
//     for(int col=1; col<=(row-2); col++){
//       System.out.print(" ");
//     }
//     System.out.print("* ");
// }
// System.out.println();
// }



//solid butterfly pattern 

// int n=4;
// for(int row=1; row<=n; row++){
//     //part 1
//     for(int col=1; col<=row; col++){
//         System.out.print("* ");
//     }
//     for(int col=1; col<=2*(n-row); col++){
//         System.out.print("  ");
//     }
//      for(int col=1; col<=row; col++){
//         System.out.print("* ");
//      }
//       System.out.println();
// }

//    for(int row=1; row<=n; row++){
//         for(int col=1; col<=n-row+1; col++){
//             System.out.print("* ");
//         }
//     for(int col=1; col<=2*(row-1); col++){
//         System.out.print( " ");
//     }
//         for(int col=1; col<=n-row+1; col++){
//         System.out.print("* ");
//     }
//     System.out.println();
//    }





//number pattern

// int n=4; 
// for(int row=1; row<=n; row++){  //1<=4->t=>
//     for(int col=1; col<=row; col++){   
//         System.out.print(col+" ");    
                                
//     }
//     System.out.println();
// }


// int n=10;
// int count=1;
// for(int row=1; row<=n; row++){

//     for(int col=1; col<=row; col++){
//         System.out.print(count + " ");
//         count++;

//     }
//     System.out.println();
// }


int n=5;
for(int row=1; row<=n; row++){
    for(int col=1; col<=row; col++){
         int a=col;
         int b=('A'-1);
         int ans=a+b;
         char finalAns=(char)ans;
         System.out.print(finalAns + " ");

    }
    System.out.println();
}


















    }
   
}

