

public class ThrowsException {
    public static void main(String[] args) {
    
int a[]= new int[5];

try{
getNumverFromArray(a);
    }catch(Exception e){
        System.out.println("catched the exception " + e.getMessage());
    }
}
    static int getNumverFromArray(int a[]) throws ArrayIndexOutOfBoundsException{
        return a[8];
  }
}
