class Adition{

int add(int a, int b){
    return a+b;

}
int add(int a, int b , int c){
    return a+b+c;
}
double add(int a , int b, int c, double d){
    return a+b+c+d;
}
}


public class Calculator {
    public static void main(String[] args) {

    Adition add = new Adition();
    System.out.println(add.add(10,20));
    System.out.println(add.add(20,30,50));
    System.out.println(add.add(10,20,30,40.6));

    }
}
