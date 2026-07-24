class Order {

    private int orderId;
    private String customerName;
    private double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void display() {
        System.out.println(orderId + " | " + customerName + " | ₹" + totalPrice);
    }
}

public class SortingCustomerOrders {

    // Bubble Sort by Total Price
    public static void bubbleSort(Order[] orders) {

        int n = orders.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void displayOrders(Order[] orders) {

        for (Order order : orders) {
            order.display();
        }
    }

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Sathwik", 3500),
                new Order(102, "Rahul", 1500),
                new Order(103, "Kiran", 5200),
                new Order(104, "Akhil", 2500)
        };

        System.out.println("Before Sorting:");
        displayOrders(orders);

        bubbleSort(orders);

        System.out.println("\nAfter Sorting (Ascending by Total Price):");
        displayOrders(orders);
    }
}