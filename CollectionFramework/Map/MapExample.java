import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapExample {
    public static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();

        mapping.put("In", "India");
        mapping.put("us", "United state");
        mapping.put("Uk", "united kingdom");
        mapping.put("eng", "England");

        System.out.println("elemets:" + mapping);

        // mapping.put("In", "Indonesia"); // it can ovveride the name india

        System.out.println("override elemets:" + mapping);

        System.out.println(mapping.size());

        mapping.putIfAbsent("Usa", "unit state a ");
        System.out.println(mapping);

        System.out.println(mapping.getOrDefault("south", "afrika"));
        System.out.println(mapping.containsKey("In"));
        System.out.println(mapping.containsValue("indonesia"));

        mapping.remove("Usa");
        System.out.println(mapping);

        System.out.println(mapping.get("In"));

        mapping.replace("In", "indonesia");
        System.out.println(mapping);

        Map<String, String> mp = new HashMap<>();
        mp.put("1", "shrutika");
        mp.put("2", "Pritesh");
        mp.put("3", "vaibhavi");
        mp.put("4", "Tejashri");
        mp.put("5", "Sayali");

        System.out.println("mp eleemnts: " + mp);

        mp.putAll(mapping);
        System.out.println(mp);

    System.out.println(mp.keySet()); // we can also create

    Set<String> keyset = mapping.keySet();


    System.out.println(keyset);   

    Set<String> keyset2 = mp.keySet();
    System.out.println(keyset2);

   Collection<String> valueset=  mp.values();
   System.out.println(valueset);
    
     Set<Map.Entry<String,String>> entryst = mp.entrySet();
     System.out.println(entryst);
   
     Set<Map.Entry<String,String>> entryst1 = mapping.entrySet();
     System.out.println(entryst1); 



     //iterating over a map:

     for(Map.Entry<String,String> entry : mapping.entrySet()){
        System.out.println("keys " +entry.getKey() + ", values :  " + entry.getValue());
     }
    }
}