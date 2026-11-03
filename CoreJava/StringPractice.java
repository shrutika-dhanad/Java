public class StringPractice{
    static void printName(String str){
        for(int i=0; i<str.length(); i++){
          char ch=str.charAt(i);
        System.out.print(ch);
        }
    }



    static int printLengthOfString(String msg){
        char[] arr= msg.toCharArray();
        int len= arr.length;
        return len;
    }




static int countVowels(String vowels){
    int count=0;
    for(int i=0; i<vowels.length(); i++){
        char ch= vowels.charAt(i);
        if(ch=='a' || ch=='e'  || ch=='i'  || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                     count++;

        }
    }
    return count;
}


static String reverseStrint(String bff){
    String reverse=" ";
     for(int i=bff.length()-1; i>=0; i--){
        char ch = bff.charAt(i);
        reverse=reverse+ch;
     }    
     return reverse;

}

    public static void main(String[] args) {
 //qs.1 print each character of the String.
        String name="mavdiii";
       printName(name);
System.out.println();



//qs2.print length of string without using length();
String msg="hello";
  System.out.println(printLengthOfString(msg));

  String vowels="shrutika";
//qs3. count vowels in a string.
     System.out.println(countVowels(vowels));


//QAS4.most important.
      //Reverse a String.
      String bff="vaibhavi";
     System.out.println("the reverse of vaibhavi is : "+ reverseStrint(bff));



// qs 6. check string is palindrome or not -naman =naman, noon=noon

    }
}