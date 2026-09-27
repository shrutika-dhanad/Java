class GenericClasses<S>{
    S id;
     GenericClasses(S id){
        this.id= id;

     }

     S getId(){
        return id;

     }
}




public class Generics {
public static void main(String[] args) {
    GenericClasses<String> gc = new GenericClasses<>("123654");
  
    System.out.println(gc.getId());
}    
}
