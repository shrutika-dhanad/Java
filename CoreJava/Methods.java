 //methods-mehtods is an entity  whch enables us to reuse the block of code.
// why?-> = using methid our code became a modular. 
    //   easy to understand,
    //   easy to debug
    //   better readiability
    //   avoid bulky ness 

 public class Methods {
 
     static void sum(){
        int a=20;
        int b=50;
        int c=50;
        System.out.println("sum: " + (a+b+c));
     }


     
//     static void mult(int p, int q){
//             int res=p*q;
//             System.out.println(res);
//     }

//     //no void return type
  
// static int Multiply(int x,int y){
//     return x*y;

// }  

//method overloading

// static int addition(int m, int n){
//        return m+n;
// }
// static  int addition(int m,int n, int o){
//     return m+n+o;
// }

 
//call by value

static void solve(int num)
{
System.out.println("inside solve: "+ num);
num=num*10;
System.out.println("inside solve:"+ num);

}




static void answer(int a, int b){
    System.out.println("answer block res:"+ a);   
    System.out.println("answer block res:"+ b);   

     a=a+10;   
     b=b+20;    
     System.out.println("answer block: "+ a);
     System.out.println("answer block: "+ b);

     
}


static void number(int numb){
    System.out.println("inside number1: " +numb);
    numb=numb*20;
    System.out.println("inside number2: " +numb);
}


    public static void main(String[] args) {
        
        // sum();
       //  mult(5,2);
          //int res= divide(10,50);
          //System.out.println(res);
       
        //   int ad1=addition(10,20);
        //   int ad2=addition(10,20,30);
        //   System.out.println(ad1);
        //   System.out.println(ad2);
       
 
//     int num=5;
//     System.out.println("inside main: "+ num);
//     solve(num);
//    System.out.println("inside main: "+num );
 

   int  a=100;
   int b=200;
   System.out.println("inside main: "+ a);  
   System.out.println("inside main: "+ b);  

   answer(a,b);

   System.out.println("inside main: "+ a); 
   System.out.println("inside main: "+ b);   


int numb=2;
System.out.println("inside main1: " + numb);

number(numb);

System.out.println("inside main2: " + numb);




    }
    
}
