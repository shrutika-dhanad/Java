import java.util.Scanner;

public class Conditionals {

     public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);


//  //ternary 

// int streakDays = 35;

//         String status = (streakDays >= 30) ? "Consistent" : "Irregular";

//         System.out.println(status);




//         // IF

//         int age = 20;
//         if (age >= 18) {
//             System.out.println("ELIGIBLE TO VOTE");
//         }

//         // if else

//         int marks = 50;

//         if (marks >= 35) {
//             System.out.println("pass");

//         } else {
//             System.out.println("fail");
//         }


// //if else -if ladder

// int accuraccy=50;

// if(accuraccy>40){
//    System.out.println("accurncacyu is grater");
// }
// else if(accuraccy > 30 &&  accuraccy <=40 ){
//     System.out.println("accurcy is better");
// }
// else{
//     System.out.println("accuracy is poor");
// }







//         // nested if else- 

//         boolean hasSubscription = true;
//         int solvedProblems = 500;

//         if (hasSubscription) {
//             if (solvedProblems >= 600) {
//                 System.out.println("master in dsa");
//             } else {
//                 System.out.println("has a subscription but not solved thee problems");
//             }
//         } else {
//             System.out.println("nothing");
//         }
//     }




// System.out.println("enter age :");
// int age = sc.nextInt();

// if(age>=18){
//     System.out.println("she is elligible for vote");
// }
// else{
//     System.out.println("not ");
// }


System.out.println("math:");
double math= sc.nextDouble();

System.out.println("science:");
double scinece= sc.nextDouble();

System.out.println("java:");
double java= sc.nextDouble();

System.out.println("oops");
double oops= sc.nextDouble();

System.out.println("python:");
double python= sc.nextDouble();


double total= math + scinece + java + oops+python;

double percentage=(total / 500)*100;


System.out.printf("total %.2f%n", total);
System.out.printf("percentage %.2f%%%n", percentage);

sc.close();
     }


    

 }