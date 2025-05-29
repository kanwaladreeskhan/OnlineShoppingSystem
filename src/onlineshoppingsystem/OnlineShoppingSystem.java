 
package onlineshoppingsystem;
  import java.util.List;
import java.util.ArrayList;
public class OnlineShoppingSystem {
 
    public static void main(String[] args) {
         List<Product>productList=new ArrayList();
         List<Customer>customerList=new ArrayList();
        Customer c1=new Customer("Kanwal Adrees Khan",1,productList );
        Product p1=new Product(1,"Bag",3000,true,customerList);
        Product p2=new Product(2,"Novel",2000,true,customerList);
        c1.addTo(p1);
       c1.addTo(p2);
        c1.display();
        c1.removeFrom(p1);
        c1.display();
        Order order=new Order(1,c1,productList,true);
        order.shipItem();
    }
    }
    
 
