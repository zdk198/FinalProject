
package DataAccess;
import BusinessLayer.Customer;
import java.util.ArrayList;
public class CustomerRepository {
    private ArrayList<Customer> dataStore;

    public CustomerRepository() {
        this.dataStore = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getAll() {
        return dataStore;
    }

    public void create(Customer customerToCreate) {
        this.dataStore.add(customerToCreate);
    }
}
