import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // arrays:- arras is a ds/container/bucket it can store multiple values of the
        // same data type.
        // array is a collection of elements of the same data type stored in a continous
        // memory location.
        // elements we can access, store,retrive ,change these type of part will make
        // easy or fast. using an array.

        // 1.array declaration

        int arr[];

        // 2.array allocation

        arr = new int[5];

        // 3.init

        int brr[] = { 10, 20, 30, 40, 50 };
           
        
        System.out.println("element at index 0  " + brr[0]);
        System.out.println("element at index 1  " + brr[1]);
        System.out.println("element at index 2  " + brr[2]);
        System.out.println("element at index 3  " + brr[3]);

        int array[] = { 50, 100, 150, 200, 250 };

        int n = array.length;

        for (int index = 0; index <= n - 1; index++) { // using classical for loop
            // System.out.println(array[index]);
        }

        for (int value : array) {
            // System.out.println(value);
        }
        // 3. for (int value : array)
        // This is called an Enhanced for loop (also known as a for-each loop).

        // English:
        // The loop visits each element of the array one by one.
        // During each iteration, the current element is stored in the variable value.
        // You do not need to use an index (0, 1, 2, etc.).

        // A for-each loop (also called an enhanced for loop) is a special type of for
        // loop used to
        // iterate through every element of an array or collection one by one without
        // using an index.

        // Definition (Interview)

        // A for-each loop is used to access each element of an array or collection one
        // by one
        // without using an index.

        // int myArr[]= new int[4];
        // Scanner sc=new Scanner(System.in);

        // int p = myArr.length;

        // for(int i=0; i<=p-1; i++){
        // System.out.println( " enter inpurt for index : " + i);
        // myArr[i]=sc.nextInt();

        // }
        // System.out.println("the elements are :- ");

        // for(int myValue: myArr){
        // System.out.println(myValue);
        // }

        // int item[]= new int[5];

        // Scanner sc= new Scanner(System.in);

        // int x = item.length;
        // for(int i=0; i<=x-1; i++){
        // System.out.println("enter the value of elements :" + i);
        // // item[i]=sc.nextInt();

        // }
        // System.out.println("the value of items is :");
        // for(int it : item){
        // //System.out.println(it);
        // }

        // sum of an array

        int newArray[] = { 10, 20, 50, 70, 90 };
        int a = newArray.length;

        int sum = 0;
        for (int i = 0; i <= a - 1; i++) {

            int value = newArray[i];

            sum = sum + value;

        }

        System.out.println(sum);

        String myArr[] = { "shrutika", "vaibhavi", "tejashri", "gayatri", "sayali" };

        for (int i = 0; i <= myArr.length - 1; i++) {
            System.out.print(myArr[i]);
        }

        String mall[] = { "elpro", "phoinix", "Streets oof urpope", "amanora" };
        for (int i = 0; i <= mall.length - 1; i++) {

            System.out.println(mall[i]);
        }

        int marks[] = { 100, 85, 75, 96, 75, 32, 48 };
       // System.out.println("marks of student : ");
        for (int progress : marks) {
         //   System.out.print(progress + " ");
        }

        // mult

        int mult[] = { 10, 2, 40, 50 };
        int num = 1;
        for (int i = 0; i <= mult.length - 1; i++) {
            int values = mult[i];
            num = num * values;

        }
        //System.out.println(num);


      int multArr[]={5,6,7,5,1,2,3,47,41};
      int number=multArr.length;

      int answer=1  ;
      for(int i=0; i<number; i++){
        int myValue=multArr[i];
        answer=answer*myValue;
      }

      //System.out.println(answer);


      //max value

      int maxArr[]={3,-50,-96,4,87,56};
      int maxValue=maxArr[0];
      for(int i=0; i<=maxArr.length-1; i++){
        if(maxArr[i] > maxValue){
            maxValue=maxArr[i];
        }
   //     System.out.println(maxValue);
      }





int practice[]={10,20,30,8,741,6256};
int maximuValue = practice[0];
int arrLen=practice.length;

for(int i=0; i<arrLen; i++){
    if(practice[i]>maximuValue ){
        maximuValue=practice[i];
    }
    System.out.println(maximuValue);

}











      int maximum[]={10,5,-6,1,23};
      int len=maximum.length;
      int maximumValue=maximum[0];
      for(int i=0; i<=len-1; i++){
           if(maximum[i] > maximumValue){
               maximumValue=maximum[i];
           }
      }

      System.out.println(maximumValue);




String Cars[]={"bollero","fortuner", "breeza","creata"};
int o= Cars.length;

for(int i=0; i<=o-1 ; i++){
 // System.out.println(Cars[i]);
}





int prac[]={10,50,90,80-2,8};
for(int i=0; i<prac.length; i++){

    System.out.println(prac[2]);
    System.out.println(prac[i]);
}

}


}
 