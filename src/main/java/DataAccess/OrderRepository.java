
package DataAccess;
import BusinessLayer.Order;
import java.util.ArrayList;
public class OrderRepository {
    private ArrayList<Order> dataStore;
    public OrderRepository() {
        this.dataStore = new ArrayList<Order>();
    }
    public ArrayList<Order> getAll() {
        return dataStore;
    }
    public void create(Order orderToCreate) {
        this.dataStore.add(orderToCreate);
    }

}
