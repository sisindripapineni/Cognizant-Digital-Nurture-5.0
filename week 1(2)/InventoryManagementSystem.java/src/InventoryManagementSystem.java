class Product {

    private int productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("ID: " + productId +
                ", Name: " + productName +
                ", Quantity: " + quantity +
                ", Price: ₹" + price);
    }
}

class Inventory {

    private Product[] products = new Product[10];
    private int count = 0;

    // Add Product
    public void addProduct(Product product) {
        if (count < products.length) {
            products[count++] = product;
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Inventory is full.");
        }
    }

    // Update Quantity
    public void updateProduct(int productId, int newQuantity) {

        for (int i = 0; i < count; i++) {
            if (products[i].getProductId() == productId) {
                products[i].setQuantity(newQuantity);
                System.out.println("Product updated successfully.");
                return;
            }
        }

        System.out.println("Product not found.");
    }

    // Delete Product
    public void deleteProduct(int productId) {

        for (int i = 0; i < count; i++) {

            if (products[i].getProductId() == productId) {

                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }

                products[count - 1] = null;
                count--;

                System.out.println("Product deleted successfully.");
                return;
            }
        }

        System.out.println("Product not found.");
    }

    // Display Products
    public void displayProducts() {

        System.out.println("\nInventory Details");

        for (int i = 0; i < count; i++) {
            products[i].display();
        }
    }
}

public class InventoryManagementSystem {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 15, 65000));
        inventory.addProduct(new Product(102, "Mouse", 40, 700));
        inventory.addProduct(new Product(103, "Keyboard", 25, 1200));

        inventory.displayProducts();

        inventory.updateProduct(102, 50);

        inventory.displayProducts();

        inventory.deleteProduct(101);

        inventory.displayProducts();
    }
}