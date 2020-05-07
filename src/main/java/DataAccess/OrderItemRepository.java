
package DataAccess;
import BusinessLayer.OrderItem;
import java.util.ArrayList;
public class OrderItemRepository {
    private ArrayList<OrderItem> dataStore;
    public OrderItemRepository() {
        this.dataStore = new ArrayList<OrderItem>();
    }
    public ArrayList<OrderItem> getAll() {
        return dataStore;
    }
    public void create(OrderItem orderToCreate) {
        this.dataStore.add(orderToCreate);
    }
}