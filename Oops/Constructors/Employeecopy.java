class Worker {
    private String name;
    private int id;
  
    public void setDetailes(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public String showName() {
        return name;
    }

    public int showId() {
        return id;
    }
 


    Worker(Worker wor2) {
        String classes;
        float salary;


        this.name = wor2.name;
        this.id = wor2.id;
      

    }

    Worker() {

    }
}

public class Employeecopy {
    public static void main(String[] args) {
        Worker wor1 = new Worker();

        wor1.setDetailes("shrutika", 21);
      System.out.println("wor 1 name" +   wor1.showName());
      System.out.println("wor 1 id" +   wor1.showId());
      

        Worker wor2 = new Worker(wor1);
        System.out.println("wor2 name : " + wor2.showName());
        System.out.println("wor2 id : " + wor2.showId());
      

    }

}
