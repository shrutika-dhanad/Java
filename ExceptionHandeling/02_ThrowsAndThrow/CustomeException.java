import java.util.Scanner;
class MyException extends  Exception{
 public MyException(String msg){
    super(msg);
 }

}



public class CustomeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    System.out.println("enter your age : ");

    try{
        int age = sc.nextInt();
        if(age > 100){
        throw new MyException("this is a error");
        }
    }catch(Exception e){
       System.out.println(e);
    }


       


    }
}
