public class LinearSearch {
    public static Search.Product search(Search.Product[] products, String name) {
        for(int i = 0; i< products.length; i++){
            if(products[i].productName.equalsIgnoreCase(name)){
                return products[i];
            }
        }
        return null;
    }
}
