
package System;

import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.OrderItem;
import BusinessLayer.Product;
import DataAccess.CustomerRepository;
import DataAccess.OrderItemRepository;
import DataAccess.OrderRepository;
import DataAccess.ProductRepository;
import java.util.ArrayList;

public class OrderSystem {

    public static void main(String[] args) {

        CustomerRepository customerRepo = new CustomerRepository();
        OrderItemRepository orderItemRepo = new OrderItemRepository();
        OrderRepository orderRepo = new OrderRepository();
        ProductRepository productRepo = new ProductRepository();

        Customer myCustomer1 = new Customer(1, "John", "Smith", "777-777-777");
        Product myProduct1 = new Product(20, "Xbox", 10, 200.00);
        Product myProduct2 = new Product(21, "Xbox Controller", 15, 50.00);
        Order myOrder1 = new Order(101, 1, "5/5/2020");
        OrderItem myOrderItem1 = new OrderItem(101, 5, 20, "Xbox", 10, 200.00);
        OrderItem myOrderItem2 = new OrderItem(101, 6, 21, "Xbox Controller", 15, 50.00);

        Customer myCustomer2 = new Customer(2, "Zach", "Korte", "888-888-8888");
        Product myProduct3 = new Product(30, "PS4", 3, 500.00);
        Product myProduct4 = new Product(31, "PS4 Controller", 7, 25.00);
        Order myOrder2 = new Order(102, 2, "5/4/2020");
        OrderItem myOrderItem3 = new OrderItem(102, 56, 30, "PS4", 3, 500.00);
        OrderItem myOrderItem4 = new OrderItem(102, 34, 31, "PS4 Controller", 7, 25.00);

        Customer myCustomer3 = new Customer(3, "Aaron", "Blake", "999-999-9999");
        Product myProduct5 = new Product(40, "Nintendo Switch", 30, 200.00);
        Product myProduct6 = new Product(41, "Nintendo Switch Cover", 5, 15.00);
        Order myOrder3 = new Order(103, 3, "5/1/2020");
        OrderItem myOrderItem5 = new OrderItem(103, 1, 40, "Nintendo Switch", 30, 200.00);
        OrderItem myOrderItem6 = new OrderItem(103, 2, 41, "Nintendo Switch Cover", 5, 15.00);

        customerRepo.create(myCustomer1);
        orderRepo.create(myOrder1);
        orderItemRepo.create(myOrderItem1);
        orderItemRepo.create(myOrderItem2);
        productRepo.create(myProduct1);
        productRepo.create(myProduct2);

        customerRepo.create(myCustomer2);
        orderRepo.create(myOrder2);
        orderItemRepo.create(myOrderItem3);
        orderItemRepo.create(myOrderItem4);
        productRepo.create(myProduct3);
        productRepo.create(myProduct4);

        customerRepo.create(myCustomer3);
        orderRepo.create(myOrder3);
        orderItemRepo.create(myOrderItem5);
        orderItemRepo.create(myOrderItem6);
        productRepo.create(myProduct5);
        productRepo.create(myProduct6);

        ArrayList<Customer> customersFromDatabase = customerRepo.getAll();
        for (Customer dbCustomers : customersFromDatabase) {
            System.out.println(dbCustomers.toString());
        }

        System.out.println("-------------------------------------");

        ArrayList<Order> ordersFromDatabase = orderRepo.getAll();
        for (Order dbOrders : ordersFromDatabase) {
            System.out.println(dbOrders.toString());
        }

        System.out.println("-------------------------------------");

        ArrayList<OrderItem> orderItemsFromDatabase = orderItemRepo.getAll();
        for (OrderItem dbOrderItem : orderItemsFromDatabase) {
            System.out.println(dbOrderItem.toString());
        }

        System.out.println("-------------------------------------");

        ArrayList<Product> productsFromDatabase = productRepo.getAll();
        for (Product dbProduct : productsFromDatabase) {
            System.out.println(dbProduct.toString());
        }

    }
}
