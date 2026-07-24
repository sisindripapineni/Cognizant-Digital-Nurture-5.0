class Product {

    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class ECommerceSearch {

    // Linear Search
    static Product linearSearch(Product[] products, int id) {
        for (Product product : products) {
            if (product.productId == id) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    static Product binarySearch(Product[] products, int id) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == id)
                return products[mid];
            else if (products[mid].productId < id)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")
        };

        int searchId = 103;

        System.out.println("Using Linear Search:");
        Product p1 = linearSearch(products, searchId);

        if (p1 != null)
            System.out.println("Product Found: " + p1.productName);
        else
            System.out.println("Product Not Found");

        System.out.println();

        System.out.println("Using Binary Search:");
        Product p2 = binarySearch(products, searchId);

        if (p2 != null)
            System.out.println("Product Found: " + p2.productName);
        else
            System.out.println("Product Not Found");
    }
}