 
package onlineshoppingsystem;
 
import java.util.List;

public class Order implements Shippable{
    private int orderId;
    private Customer customer;
    List<Product>orderproductList;
     private boolean isShipped;
       public Order(int orderId, Customer customer, List<Product> products,Boolean isShipped) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderproductList = products;
        this.isShipped = isShipped;
    }
    @Override
       public void shipItem( ){
                   isShipped = true;
        System.out.println("Order ID: " + orderId + " has been shipped for customer: " + customer.getcustomerName());
    }
       public int getOrderId() {
        return orderId;
    }
       
    public boolean isShipped() {
        return isShipped;
    }

    public Customer getCustomer() {
        return customer;
    }
}

        
