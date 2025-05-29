 
package onlineshoppingsystem;
import java.util.ArrayList;
 import java.util.List;
public class Customer implements Purchasable{
     private String name;
   private int id;
   List<Product>productList;
    
   Customer(String name,int id,List<Product>productList ){
       this.name=name;
       this.id=id;
       this.productList=productList;
       
   }
   public String getcustomerName(){
       return name;
   }
     @Override
     public void addTo(Purchasable obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            if (!productList.contains(p)) {
                productList.add(p);
                System.out.println(p.getProductName() + " added to cart of " + name);
                
            }
        }
     }
      @Override
    public void removeFrom(Purchasable obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            if (productList.remove(p)) {
                System.out.println(p.getProductName() + " removed from cart of " + name);
            }
        }
    }
    public void display() {
        System.out.println("Cart of " + name + ":");
        for (Product product : productList) {
            System.out.println("- " + product.getProductName());
        }
    }
   
}
