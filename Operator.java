
public class Operator {

    public static void main(String[] args) {
        //arithmetic 

        int firstValue=10; 
        int secondValue=20;

        int sum=firstValue+secondValue;
        int sub =firstValue-secondValue;
        int mult=firstValue*9;
        int avg=secondValue/6;
        int remainder=firstValue %4;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(avg);
        System.out.println(remainder);

        //relational

        int currentValue=95; 
        int targetValue=456;
         System.out.println("reltional ");
        System.out.println( currentValue == targetValue);
        System.out.println(currentValue != targetValue);
        System.out.println(currentValue >= targetValue);
        System.out.println(currentValue <= targetValue);
        System.out.println(currentValue > targetValue);
        System.out.println(currentValue < targetValue);


        //logical
        boolean dsaCompleted = true;
        boolean coreCompleted = false;
 
        System.out.println(dsaCompleted && coreCompleted);
        System.out.println(dsaCompleted || coreCompleted);
        System.out.println(!coreCompleted);

      //Assignment operator

        int points=85;

        points += 85;
        System.out.println(points);
        points -= 5;
        System.out.println(points);
        points *= 2;
        System.out.println(points);
        points /= 4;
        System.out.println(points);
        points %= 6;
        System.out.println(points);

        //inc and dec 

        int activeNum=500;

        int preInc = ++activeNum;  //500+1=501  preInc=501 

        int postInc=activeNum++;  //501++ =postInc=501 
                                  //activeNum++ =501++ =501+1=502                      
        System.out.println(preInc);  //501
        System.out.println(postInc);  //501
        System.out.println(activeNum);  //502



        //Ternary operator
        //condition ? exp 1 : exp 2

        int myAge= 1;
        String result = (myAge >= 18) ? "vote" : "no";
        System.out.println(result);

        int money = 1000;

        String res= (money < 0) ? "negative" : "possitive";
        System.out.println(res);

         
        //instanceOf operator

        String name="aditya";
        System.out.println(name instanceof String );
       
        String person ="Raj";

        System.out.println(person instanceof String);

        String lang ="java";
        if(lang instanceof String){
            System.out.println("yes it is a string object");
        }


        Object obj= "hello";  
        System.out.println(obj instanceof Integer);

       }
}