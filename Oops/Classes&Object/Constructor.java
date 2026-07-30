public class Constructor{
 int id;
 String name;
 int age;
 int nos;

  public Constructor(){
     System.out.println("default constructor called ");
 }
public Constructor(int id, String name, int age, int nos){
 System.out.println("parameterised constocter called..");
    this.id=id;
    this.name=name;
    this.age=age;
    this.nos=nos;

}



    public static void main(String[] args) {
        
        Constructor con= new Constructor();
        con.id=1;
        con.name="shrutika";
       
        System.out.println(con.id);
        System.out.println(con.name);


        Constructor paraCon=new Constructor(11, "pritesh" , 25, 5);
             System.out.println(paraCon.id +  " "+ paraCon.name + " " + paraCon.age +" " + paraCon.nos );
    }   
}