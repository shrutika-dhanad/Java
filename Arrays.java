import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        //arrays:-  arras is a ds/container/bucket it can store multiple values of the same data type.
        //array is a collection of elements of the same data type stored in a continous memory location.
        //  elements we can access, store,retrive ,change  these type of part will make easy or fast. using an array. 

        //1.array declaration

      int arr[];

      //2.array allocation
          
       arr = new int[5];

      //3.init
      
      int brr[]={10,20,30,40,50};

     System.out.println("element at index 0  " +brr[0]);
     System.out.println("element at index 1  " +brr[1]);
     System.out.println("element at index 2  "+ brr[2]);
     System.out.println("element at index 3  " + brr[3]);



     int array[]={50,100,150,200,250};

     int n=array.length;
  
     for(int index=0; index<=n-1; index++){  //using classical for loop
        //System.out.println(array[index]);
     }

     for(int value : array){    
    System.out.println(value);   
     }      
   //3. for (int value : array)
// This is called an Enhanced for loop (also known as a for-each loop).

    // English:
 // The loop visits each element of the array one by one.
 // During each iteration, the current element is stored in the variable value.
// You do not need to use an index (0, 1, 2, etc.).


//   A for-each loop (also called an enhanced for loop) is a special type of for loop used to
//  iterate through every element of an array or collection one by one without using an index.

// Definition (Interview)

// A for-each loop is used to access each element of an array or collection one by one 
// without using an index.



// int myArr[]= new int[4];
// Scanner sc=new Scanner(System.in);

// int p = myArr.length;

// for(int i=0; i<=p-1; i++){
//     System.out.println( " enter inpurt for index : " + i);
//     myArr[i]=sc.nextInt();

// }
//     System.out.println("the elements are :- ");

// for(int myValue: myArr){
//     System.out.println(myValue);
// }


int item[]= new int[5];

Scanner sc= new Scanner(System.in);

int x = item.length;
for(int i=0; i<=x-1; i++){
    System.out.println("enter the value of elements :" + i);
    item[i]=sc.nextInt();

}
System.out.println("the value of items is :");
for(int it : item){
System.out.println(it);
}

    }
}