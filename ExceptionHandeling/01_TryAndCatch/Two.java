public class Two {
    public static void main(String[] args) {
        int a[] = new int[5];
        // try{
        //     System.out.println(s[6]);

        // }catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("exception is catched..");
        // }catch(ArithmeticException  e){
        //     System.out.println("exception is catched");
        // }
        // finally{
        //     System.out.println("i will run always..");
        // }


        try{
            getNumberFromArray(a);


        }catch(Exception e){
            System.out.println("catched the exception " + e.getMessage());
        };


    int getNumberFromArray(int a[])throws ArithmeticException {
        return a[8];
    }
}

}