public class DataTypes {

    public static void main(String[] args) {
        // numeric DT= int, long, byte,short

        int a = 10;
        System.out.println(a);

        long num = 42589535;
        System.out.println(num);

        // byte num2=526; //eerr- out of range
        byte num2 = 127;

        System.out.println(num2);

        short num3 = 4855;
        System.out.println(num3);

        // floating DT- uses the ( f ) at the end

        float num5 = 3.1463f;
        System.out.println(num5);

        float num6 = 3.1485693214f;
        System.out.println(num6);

        // booleand and char
        boolean isEligible = true;

        // boolean isEligibles=1; throw an error - because int cannot be converted into
        // boolean
        // System.out.println(isEligibles);

        System.out.println(isEligible);

        char name = 'a';
        System.out.println(name);

        /// ASCII

        int number = 'a';
        System.out.println("add of 'a'+2 is :" + (char) (number + 2));  //it is also an ex of explicit tc

        // implicit conversion :- small to big dt

        byte numb = 42;
        long numb2 = numb;
        System.out.println(numb2);

        // Explicit Conversion
        long value1 = 1236479857;
        int value2 = (int) (value1);
        System.out.println(value2);

        int value='b';
        System.out.println("sum is :" + (value+5)); // 103
        System.out.println("sum is :" + (char)(value+5));

    }
}
