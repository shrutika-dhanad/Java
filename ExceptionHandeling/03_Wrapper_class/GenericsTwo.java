class Language<J, I>{

    J langName;
    I LangId;

    Language(J langName, I langId){
        this.langName=langName;
        this.LangId= langId;

    }

    I getId(){
        return LangId;
    }
   J getLangName(){
    return langName;

   }
}


public class GenericsTwo {

    public static void main(String[] args) {
        Language<String , Integer> l = new Language<>("Java", 520);
          System.out.println("id is : " + l.getId());
          System.out.println("language name is : " + l.getLangName());

    }
}
