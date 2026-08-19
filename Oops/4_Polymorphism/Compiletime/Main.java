class PrintData{

    public void data(String text){
        System.out.println("print text " + text);
    }
    public void data(int number){
        System.out.println("print number"+ number);
    }
    public void data(float num){
        System.out.println("print floatin point numebr" + num);
    }
}



public class Main {
public static void main(String[] args) {
PrintData pd = new PrintData();
pd.data("shrutika");
pd.data(21);
pd.data(2153.515485f);
}    
}
