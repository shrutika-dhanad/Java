public class Second {
    
private int id;
private int age;
private String name;



public String getName(){
    return name;

}
public int getId(){
    return id;

}
public int getAge(){
    return age;

}


public void setName(String name){
    this.name=name;

}
public void setId(int id){
    this.id=id;

}
public void setAge(int age ){
    this.age=age;

}



    public static void main(String[] args) {
        
Second obj= new Second();
obj.setName("shrutika");
System.out.println("name : =>" + obj.getName());

obj.setId(1);
obj.setAge(21);
System.out.println(obj.getId() + " "+ obj.getAge());
    }

}