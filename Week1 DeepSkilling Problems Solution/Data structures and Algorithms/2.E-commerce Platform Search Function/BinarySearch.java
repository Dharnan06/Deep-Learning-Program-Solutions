public class BinarySearch {
    public static Search.Product search(Search.Product[] products, String name) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0) return products[mid];
            else if (compare < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }
}
