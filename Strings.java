import java.util.Scanner;

public class Strings{
    public static void main(String[] args) {
        //string : - sequence of character .
        //we can combine multiple charaters together and this is known as String.
   
        //creating string 
         String str="shrutika";
         
        //  String is a class , str is variable/object of string class ,  "shrutika" is string literal.
         
        String str1=new String("Shrutii");

        //string pool
      
        // string pool is speacial area inside in heap memory, 
        // string pool madhe apn je variable, string create krto te space alot kartat, 
        //means i can create: String str="Shrutika"  - then => shrutiaka he string literal String pool mdhe 
        //        space banvel/ memroy alot hote. str he refer krt aplya string literal la.
        //and if we have same name of string literal like String name="shrutika" , then name  1. string pool 
        // chech hoto -> ki hya type chi string already ahe ki nahi jr asel tr -> name variable he tyach String
        // la refer krt (shrutika hya string la) , new space/new memory alot nahi create krt String pool mdhe.
       // Or 
       // if there is diffremt string ex- String s="pritesh" , -> . string pool check hoil, "pritesh name chi
       // String ahe ka nahi nsel tr s he new memory space create/alot krel/s he pritesh la refer krel string pool mdhe.
 

       //Stack Memory :=>
        //  aple je references astat string che ex- str, name, s  he sare references stack memory madhr space gheta
            // and je string literals astata te heap memory mdhil String pool mdhe Space gheta.

            //*heap memory */
    //         _____________
    //         |            |                            //*Stack memory */
    //         |            |                             _____________
    //         |            |                            |            |
    //         |            |                            |references  |
    //         |            |                            |            |
    //         |            |                            _____________|_ 
   //         | String pool |
    //         |            |
    //         |            |
    //         |_____________|
    //


    //String str= new String("shrutika");
    // String str -> he Stack memory ghet and 
    // new String ("shrutika") -> he heap memory ghete

//   accesing String character
//                     :=> using charAt();
  
String myName="Shrutika";
      System.out.println(myName);
      System.out.println(myName.charAt(0));
      System.out.println(myName.charAt(1));
      System.out.println(myName.charAt(2));
      System.out.println(myName.charAt(3));


      //finding length oof String:=>
        System.out.println(myName.length());

// String is Immutable 
// :=> when we can crate a string we can not change the string characters again
    // ex- String str =" pritesh";
    // str.setCharAt(0)="m"; it throw an error
    // this is not allowed beacause string are immutable. 

 //BUT

 String name="hitesh";
 name="love";
 System.out.println(name);  //o/p-> love
 //it can changed because ->  1st (name) string hi update nhi zali, string pool mdhe check zal aashi kahi string exitst
 //krte ka -> tr mg  string ne refference change kela means -> new string memory create zali. and love print zal.
 //in short -> new string create kelo and taywr reference la shift kel.actual string la update/muted nhi kru shkt.
 //reference shifting possibke ahe , string mutatiom posssible nhiye.

//string Builder :=>


 
//compairing String.
 //1. ==   if literals are == then true otherwise false, case sensisitive.
 //          it  can compare the refrences, not the content.


 String name1="Raj";
 String name2="Raj";
 
    if(name1==name2){
        System.out.println("string are equal");
    }
    else{
        System.out.println("string are not  equal");

    }


  String First="Shrutika";
  String Last="SHrutika";
  if(First==Last){
    System.out.println("strings are equal.");
  }  
  else{
    System.out.println("strings are not equal.");

  }
 
 //2. .equals() :=> strings are case sensitive.
//                  it can compare the content not the reference.


String oldName="pritesh";
String newName="Pritesh";
if(oldName.equals(newName)){
    System.out.println("strings are equal");
}else{
    System.out.println("not equals.");
}

 //3. .equalsIgnorecase()
  //it is case insesnsitive,


  String brother="Prituu";
  String bhau="pritUU";

  if(brother.equalsIgnoreCase(bhau)){
    System.out.println("strings are totally equal");
    
  }else{
    System.out.println("strings are not  equal");

  }

//String imput 

//it can have  2 input methods.
//1.next(); :- it can take only 1 word as a imput 
//2.nextLine():-it can take whole line in as input 

// Scanner sc= new Scanner(System.in);
// System.out.println("provide the String content for nextLine()");
// String msg=sc.nextLine();
// System.out.println("nextline value : " + msg );
// System.out.println("provide the String content for next()");
// String msg2=sc.next();
// System.out.println("next value : "+ msg2);



Scanner sc= new Scanner(System.in);
System.out.println("enter your age:");
String age=sc.nextLine();
System.out.println("my age is : " +age);



}
}