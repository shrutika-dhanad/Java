 class mult {

int multiplication(int a,int b,int c){
return a*b*c;
}

double multiplication( double a,double b, double c,double d ){
return a*b*c*d;

}

double multiplication( double a,double b, double c,float d ,float f){
return a*b*c*d*f;

}    

}
public class Example {
    public static void main(String[] args) {
 mult mul= new mult();
System.out.println("one   :" + mul.multiplication(10,20, 30));  
System.out.println("two   :" + mul.multiplication(10000.10,2094265.0, 3084597624.25,408545844.2558));  
System.out.println("three :" + mul.multiplication(15.2,50.0,50.321,85.3));  

    }
    
    }
