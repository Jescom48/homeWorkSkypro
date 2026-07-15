import java.util.Arrays;
import java.util.Objects;

public class Order {

    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        if (basket != null) {
            this.basket = Arrays.copyOf(basket, basket.length);
        } else {
            this.basket = new Product[0];
        }
    }

    @Override
    public String toString() {
        return "Покупатель: " + customer + ". Корзина: " + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;

        if (!Objects.equals(customer, order.customer)) {
            return false;
        }
        if (this.basket.length != order.basket.length) {
            return false;
        }

        for (int i = 0; i < this.basket.length; i++) {
            Product b1 = this.basket[i];
            Product b2 = order.basket[i];
            if (b1 == null && b2 == null) {
                continue;
            }
            if (b1 == null || b2 == null) {
                return false;
            }
            if (!b1.equals(b2)) {
                return false;
            }
        }
        return true;
    }

}
