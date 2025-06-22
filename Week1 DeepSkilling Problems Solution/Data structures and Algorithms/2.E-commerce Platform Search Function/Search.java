import java.util.Arrays;
import java.util.Comparator;

public class Search {
        static class Product {
            int productId;
            String productName;
            String category;

            Product(int productId, String productName, String category) {
                this.productId = productId;
                this.productName = productName;
                this.category = category;
            }

            @Override
            public String toString() {
                return productId + " - " + productName + " (" + category + ")";
            }
        }
        public static void main(String[] args) {
            Product[] products = {
                    new Product(1, "Computer", "Electronics"),
                    new Product(2, "Shirt", "Clothing"),
                    new Product(3, "Note", "Education"),
                    new Product(4, "Headphones", "Electronics"),
                    new Product(5, "Pen", "Education")
            };

            System.out.println("Linear Search for 'Pen':");
            Product result1 = LinearSearch.search(products, "Pen");
            System.out.println(result1 != null ? result1 : "Product not found.");

            Arrays.sort(products, Comparator.comparing(p -> p.productName));

            System.out.println("Binary Search for 'Laptop':");
            Product result2 = BinarySearch.search(products, "Laptop");
            System.out.println(result2 != null ? result2 : "Product not found.");
        }
}

