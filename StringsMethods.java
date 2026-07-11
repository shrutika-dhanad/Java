public class StringsMethods {
    public static void main(String[] args) {
        // ...........Strings Common method.............
        // 1. length()
        // 2..equals()
        // 3. .equalsIgnoreCase()
        // 4. charAt(0)

// 5. empty --> length =0;

        String str = "";
        System.out.println(str.isEmpty()); // true.
        String str1 = " ";
        System.out.println(str1.isEmpty()); // false because spaces also counted.

// 6. blank -> empty of strings only have spaces.

        String str3 = "";
        System.out.println(str3.isBlank()); // true.
        String str4 = " ";
        System.out.println(str4.isEmpty()); // false.

 // 7. trim()-> leading and drilling spaces will bbe removed.

        String name = " shrutika  ";
        System.out.println(name.length()); // 11 space pn count kele
        name = name.trim();
        System.out.println(name.length());// 8 spaces will be remove.

//toUpperCase() and toLowerCase()

String  sirName="dhanad";
String myName="SHRUTIKA";
System.out.println(sirName.toUpperCase());
System.out.println(myName.toLowerCase());


//substring(); finding a new substring from a line 
//substring(beginIndex, endIndex) beginIndex- inclusibe aste-  yala substring mdhe include kel jat.
//                                endIndex - exclusive aste - yala substring mdhe include nhi kel jat.
String line="my name is shrutika";
System.out.println(line.substring(3,7));
System.out.println(line.substring(0,4));

    }

}
