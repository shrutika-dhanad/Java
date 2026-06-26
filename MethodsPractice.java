public class MethodsPractice {
  static void solution(int num) {

    System.out.println("inside solution:" + num);
    num = num * 5;
    System.out.println("inside solution:" + num);

  }

  static void PrintWelcomeMsg() {
    System.out.println("hellooo shrutika");
    System.out.println("have a great day.");
  }

  static int PrintSum(int a, int b) {
    return a + b;
  }

  static boolean isEven(int number) {
    if (number % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }


static int getMaximum(int x, int y){
  if(x>y){
    System.out.println("yes x is greater");
     return x;
  }
  else{
        System.out.println("yes y is greater");

    return y;
  }
}


static void dislay(int p){
  System.out.println("the value of p is :"+ p);
}
static void display(String college){
  System.out.println("name of college is :" + college);
}


static void updateValue(int value){

  value=value+10;
  
  System.out.println(value);
}

  public static void main(String[] args) {

    int num = 5;
    // System.out.println("inside main: "+ num);
    /// solution(num);
    // System.out.println("inside main:"+ num);

    // PrintWelcomeMsg();

    int sum = PrintSum(10, 70);
    // System.out.println(sum);

    boolean result = isEven(10);
    //System.out.println(result);


   int max= getMaximum(50,32);
   //System.out.println(max);
   
   dislay(1);
   display("KJS collge kopargaon");

   int value=600;

   System.out.println(value);
   updateValue(value);
   System.out.println(value);


   


  }

}
