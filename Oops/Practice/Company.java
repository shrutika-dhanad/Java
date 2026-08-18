class Product{
    private String productname;

    public void setProduct(String productname){
        this.productname=productname;

    }

    public String getProduct(){
        return productname;
    
    }
}
class Mamaeaerth extends Product{
 
  
    public void productBrandName(){
        System.out.println("product is of mamaearth brand");
    }


}

public class Company {
  public static void main(String[] args) {
    Mamaeaerth mm = new Mamaeaerth();
    mm.setProduct("shampoo");
    System.out.println("product name is :" + mm.getProduct());
    mm.productBrandName();
  }  
}
