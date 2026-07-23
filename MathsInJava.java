// // public class MathsInJava {

// //qs . print digits

// //     static void PrintDigits(int num){
// //         while(num!=0){     //num =1478963!=0 t ->  %10= 3 , 147896!=0=> t 
// //             int digits= num % 10;                           //1478 
// //              System.out.println(digits);  //=3 , =6,=9,
// //             num=num/10;       //num=147896 = 1478963/10  = 147896 , 147896/10 = 14789 

// //         }
// //     }
// //      public static void main(String[] args) {
// //          int num=1478963;

// //          PrintDigits(num);
// //      }
// // }

// public class MathsInJava {

//     static int countDigits(int num) {
//         int count = 0;
//         while (num != 0) {
//             int digits = num % 10;
//             count++;
//             num = num / 10;

//         }
//         return count;

//     }

//     // sum of digits

//     static int sumOfDigits(int n) {

//         int sum = 0;
//         while (n != 0) {
//             int digit = n % 10;
//             sum = sum + digit;
//             n = n / 10;

//         }
//         System.out.print("sum is : ");
//         return sum;

//     }

//     //reverse num 
//    static int reversDigit(int number){
//     int reverse=0;  // 0
//     while(number!=0){    // 123654 !=0->T ,12365!=0->T , T 
//         int digit= number%10;     // 123654%10= 12365= digit= 4 , 12365 %10=> 1236 digit = 5  
//           reverse =reverse*10+digit; // 0=0*10+4= 4, 4=4*10+5=> 45
//         number=number/10;          // 123654/10= 12365.4=>12365 

//     }
//     return reverse;    // 4,45 and so on   
//    }

//     public static void main(String[] args) {

// //    int number=12365856;
// //    int revNum=reversDigit(number);
// //    System.out.println(revNum);

// //   int ans = countDigits(num);
// //         System.out.println( ans);

//         // sum of digits

//         int answerOfSum = sumOfDigits(123654);
//         System.out.println(answerOfSum);

//     }
// }

public class MathsInJava {

    static boolean isPrimeNumebr(int number) {
        // for(int i=2; i<number; i++){
        // if(number%i==0){
        // System.out.println("this is not a prime number");
        // return false;
        // }
        // }
        // System.out.println("is a prime numebr");
        // return true;

        // another way......................

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    // GCD of a number
    static int getGCD(int a, int b) {
        while (b != 0) {
            int oldvalueOfb = b;
            b = a % b;
            a = oldvalueOfb;

        }
        int answer = a;
        return answer;
    }

    static int getLCM(int a, int b) {
        int gcd = getGCD(a, b);

        int prod = a * b;

        int lcm = prod / gcd;

        return lcm;

    }

    static boolean isArmstrongNumber(int numb) {
        int sum = 0;
        int originalNumber = numb;

        while (numb != 0) {

            int digit = numb % 10;
            int cubeOfDigit = digit * digit * digit;
            sum = sum + cubeOfDigit;
            numb = numb / 10;
        }
        if (sum == originalNumber) {
            return true;

        } else {
            return false;

        }

    }


    //find divisor or the perfect number.

    static boolean isPerfectNumber(int nu){
        int sum=1;
        for(int i=2; i*i<=nu; i++){
            if(nu%i==0){
       int firstfactor=i;
       int secondFactor=nu/i;
       sum=sum+firstfactor+secondFactor;

            }
        }
        if(sum==nu){
            return true;
        }
        else{
            return false;
        }
    }


    //print all pprime number of 1 to N

    
    public static void main(String[] args) {
          
 

     int nu=6;
     System.out.println(isPerfectNumber(nu));

        int numb =153;
        System.out.println(isArmstrongNumber(numb));

        System.out.println(getLCM(12, 18));

        System.out.println(getGCD(18, 12));

        // int number=1;
        // System.out.println(isPrimeNumebr(number));
    }
}