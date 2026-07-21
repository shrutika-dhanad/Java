// public class MathsInJava {

//qs . print digits

//     static void PrintDigits(int num){
//         while(num!=0){     //num =1478963!=0 t ->  %10= 3 , 147896!=0=> t 
//             int digits= num % 10;                           //1478 
//              System.out.println(digits);  //=3 , =6,=9,
//             num=num/10;       //num=147896 = 1478963/10  = 147896 , 147896/10 = 14789 

//         }
//     }
//      public static void main(String[] args) {
//          int num=1478963;

//          PrintDigits(num);
//      }
// }

public class MathsInJava {

    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            int digits = num % 10;
            count++;
            num = num / 10;

        }
        return count;

    }

    // sum of digits

    static int sumOfDigits(int n) {

        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;

        }
        System.out.print("sum is : ");
        return sum;

    }


    //reverse num 
   static int reversDigit(int number){
    int reverse=0;  // 0
    while(number!=0){    // 123654 !=0->T ,12365!=0->T , T 
        int digit= number%10;     // 123654%10= 12365= digit= 4 , 12365 %10=> 1236 digit = 5  
          reverse =reverse*10+digit; // 0=0*10+4= 4, 4=4*10+5=> 45
        number=number/10;          // 123654/10= 12365.4=>12365 

    }
    return reverse;    // 4,45 and so on   
   }


   


    public static void main(String[] args) {

   int number=123654;
   int revNum=reversDigit(number);
   System.out.println(revNum);



        int num = 123;
        int ans = countDigits(num);
        System.out.println( ans);

        // sum of digits

        int answerOfSum = sumOfDigits(123654);
        System.out.println(answerOfSum);




    }
}