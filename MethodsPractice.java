public class MethodsPractice {
  static void solution(int  num){

    System.out.println("inside solution:"+ num);
    num=num*5;
    System.out.println("inside solution:"+ num);
   
}


 public static void main(String[] args) {
        
        int num=5;
        System.out.println("inside main: "+ num);
        solution(num);
        System.out.println("inside main:"+ num);
        

       



    }
    
}
