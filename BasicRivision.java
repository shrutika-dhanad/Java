public class BasicRivision{
    static int countVovwels(String vowels){
 int count=0;
 for(int i=0; i<vowels.length(); i++){
    char ch=vowels.charAt(i);
     if(ch=='a' | ch=='e'){
        count++;

     }

     

 }

  return  count;


    }
    public static void main(String[] args) {
        String vowels="shrutika";

System.out.println(countVovwels(vowels));
    }
}