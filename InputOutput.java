import java.util.Scanner;

public class InputOutput {
  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         
        System.out.println("enter name");

        String name = sc.nextLine();
        System.out.println("name is:" + name);
       
        System.out.println("enter last name :");
        String lastName= sc.nextLine();
        System.out.println("lastname is :"+ lastName);
       

        System.out.println("enter age ");
        int age = sc.nextInt();
        System.out.printf(" age is %d%n " , age);

       

        sc.close();
    }
}
