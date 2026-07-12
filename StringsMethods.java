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

                // 8.toUpperCase() and toLowerCase()

                String sirName = "dhanad";
                String myName = "SHRUTIKA";
                System.out.println(sirName.toUpperCase());
                System.out.println(myName.toLowerCase());

                // 9.substring(); finding a new substring from a line
                // substring(beginIndex, endIndex) beginIndex- inclusibe aste- yala substring
                // mdhe include kel jat.
                // endIndex - exclusive aste - yala substring mdhe include nhi kel jat.
                String line = "my name is shrutika";
                System.out.println(line.substring(3, 7));
                System.out.println(line.substring(0, 4));

                // 10.contains if the word is present in String the it is true otherwise false.
                String sentence = "this is me and my laptop";
                System.out.println(sentence.contains("shrutu"));

                // 11. valueOf() : - convert the any type of data into String

                int num = 123654;
                // String conversion=String.valueOf(num+1 );
                String conversion = String.valueOf(num);
                // System.out.println(num+1); // o/p :- 123655 beacause we can rpint sum of num
                // 123654 +1= 123655
                System.out.println(conversion + 1); // 12365411 beacuse num is coverted into String

                // 12.startsWith(String prefix)
                // if word start with give word then return true otherwise f.

                String mySentennce = "shrutika is a very intelligent girl.";
                System.out.println(mySentennce.startsWith("shru"));
                System.out.println(mySentennce.startsWith("u"));
                System.out.println(mySentennce.startsWith("is a "));
                System.out.println(mySentennce.startsWith("shrutika i"));

// 13.endWith(String sufix)
// // if word end with give word then return true otherwise f.
                String myLine = "pritesh dhaand is a fullstack developer";
                System.out.println(myLine.endsWith("developer"));
                System.out.println(myLine.endsWith("DEVELOPER"));
                System.out.println(myLine.endsWith("a fullstack")); //f
                System.out.println(myLine.endsWith("is a fullstack developer"));

//14.toCharArray() :- 
//convert a string into an array.

String myname="shrutika";
char [] crr=name.toCharArray();

for(char ch : crr){
        System.out.println("the value of char :" + ch);
}



//15.split - split a String into String array.
String input="hello, shrutika, how, are, you";
String[] arr=input.split(",");
for(String stri: arr){
        System.out.println(stri);
}


//16.replace(oldchar , newchar)
// replace old char into new char and form a new String.
String hello="vaibhavi";
hello=hello.replace('v', 'n');
System.out.println(hello);
        }

}
