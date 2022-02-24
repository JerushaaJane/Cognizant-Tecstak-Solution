/*aya buys “N” no of products from a shop. The shop offers a different percentage of discount on each item. She wants to know the item that has the minimum discount offer, so that she can avoid buying that and save money.

[Input Format: The first input refers to the no of items; the second input is the item name, price and discount percentage separated by comma(,)]

Assume the minimum discount offer is in the form of Integer.

Note: There can be more than one product with a minimum discount.

Sample Input 1:

4

mobile,10000,20

shoe,5000,10

watch,6000,15

laptop,35000,5

Sample Output 1:

shoe

Explanation: the discount on the mobile is 2000, the discount on the shoe is 500, the discount on the watch is 900 and the discount on the laptop is 1750. So the discount on the shoe is the minimum.

Sample Input 2:

4

Mobile,5000,10

shoe,5000,10

WATCH,5000,10

Laptop,5000,10

Sample Output 2:

Mobile 

shoe 

WATCH 

Laptop
*/
import java.util.*;

class Product implements Comparable<Product> {
    private final String name;
    private final double price;
    private final double discount;

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Double getDiscountPrice() {
        return price * discount / 100;
    }

    @Override
    public int compareTo(Product other) {
        return this.getDiscountPrice().compareTo(other.getDiscountPrice());
    }

    @Override
    public String toString() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        int n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            String[] inputs = scanner.next().split(",");
            String name = inputs[0];
            double price = Double.parseDouble(inputs[1]);
            double discount = Double.parseDouble(inputs[2]);

            Product product = new Product(name, price, discount);
            products.add(product);
        }

        products.stream()
                .filter((product) -> product.getDiscountPrice().equals(Collections.min(products).getDiscountPrice()))
                .forEach(System.out::println);
    }
}
