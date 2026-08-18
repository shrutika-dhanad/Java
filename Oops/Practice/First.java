package Practice;

public class First {
    String color;
    String brand;

    void start(String brand) {
        // brand= "toyota";
        System.out.println("car is starting..");
        System.out.println("brand is " + brand);
    }

    void stop(String color) {
        // color="yellloww";
        System.out.println("car is stopping..");
        System.out.println("color: " + color);
    }

    public static void main(String[] args) {

        First f = new First();
        f.start("toyota");
        f.stop("black");
       
    }
}
