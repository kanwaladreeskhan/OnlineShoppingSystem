 
package onlineshoppingsystem;
 import java.util.List;
import java.util.ArrayList;
public class Product implements Purchasable,Shippable{
    private int id;
    private Boolean inStock;
     private Boolean shippable;
   private String productname;
   private double price;
   List<Customer>customerList;
   Customer customer;
   Product(int id,String productname,double price,Boolean inStock,List<Customer>customerList){
       this.id=id;
       this.productname=productname;
       this.price=price;
       this.inStock=inStock;
       this.customerList=customerList;
   }
   @Override
    public void addTo(Purchasable obj ){
        if(obj instanceof Customer){
            Customer c=(Customer) obj;
            if(!customerList.contains(c)){
                customerList.add(c);
            }
        }
    }
   @Override
    public void removeFrom(Purchasable customer){
         customerList=new ArrayList();
        customerList.remove(customer);
    }
   @Override
      public void shipItem( ){
           if(shippable ==true){
           System.out.println("Item is Shippable!");
          
       }
        else{
            System.out.println("Item is not shippable!");
   }
      }
    
   public void availability(Customer c){
       if(inStock==true){
           System.out.println("Item is Available!");
           addTo(c);
}
             else{
            System.out.println("Item is Unavailable!");
                  
       }
   }
      public void shippable(Customer c){
        if(shippable ==true){
           System.out.println("Item is Shippable!");
           addTo( c);
}
             else{
            System.out.println("Item is not shippable!");
                  
       }
   }
     
    
        public String getProductName(){
       return productname;
   }
}
