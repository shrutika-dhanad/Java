public class Variables{
   
  public static void main(String[] args) {

//.......java lang is case sensitive

//1.case sensitivitty [age vs AGE]
//2.starting character [a, A,_,$]
//3.subsequent character [0 to 9,_,$
//4.no reserved keyword[class, static etc]
//5.length[no limit ,  but meaningfull names needed ] varinabel name must be a meaningfull
//6.conventions :camelcase, upperCase for constant etc.

        //1. create and declare 
        int age ;
        //assign  value
        age=10;
        age=50;
        System.out.println(age);
        
        //define and initialize 


        int totalMarks=86;
        System.out.println(totalMarks);

        //case sensitive 
        int weight = 50;
        int WEIGHT=58;
        System.out.println(weight);
        System.out.println(WEIGHT);

         //starting letter 
         int marks =100;
         int Marks=60;
         int $name=85;
         int _age=96; 

         //Subsequent letter
         int height5=52;
         int height$shruti=63;
         int theight_=56;
         int height$=52;

         //No reservd keyword - we cant use the reserved keyworkd in java as a variables;
        //   int class=40;  //it throw an error
        // int static=79;


        //Length
          int a=10;   //no
          int height =82; //have a meaning
          int kaisehosarehishrutika=521;  //no

        //CamelCase
          int myAge=8;

          //uppercase for constants
                int Days_IN_Year=365;

    }
}