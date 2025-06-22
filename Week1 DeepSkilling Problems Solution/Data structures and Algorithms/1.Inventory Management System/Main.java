public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product p1 = new Product("10AE", "Pen", 10, 10.0);
        Product p2 = new Product("102BQ", "Note Book", 21, 40.0);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.displayInventory();

        inventory.updateProduct("10AE", "Note Book", 50, 100.0);
        inventory.deleteProduct("11ZQ");

        inventory.displayInventory();


    }
}