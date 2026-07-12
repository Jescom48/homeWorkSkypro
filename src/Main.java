import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Samsung A71", 17999, "смартфоны");
        Product p2 = new Product(2, "Apple 6s", 15000, "смартфоны");
        Product p3 = new Product(3, "Poco x3", 7000, "смартфоны");
        Product p4 = new Product(1, "Samsung A71", 10000, "смартфоны"); // смартфон с уценкой

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        System.out.println();

        System.out.println(p1.equals(p2)); // проверка что продукты разные
        System.out.println(p1.equals(p4)); // проверка разных продуктов с одинаковым id  и категорией

        System.out.println();

        Product[] basket1 = {p1, p3, p2};
        Product[] basket2 = {p3, p1, p2};
        Product[] basket3 = {p3};
        Product[] basket4 = {p1, p3, p2};

        System.out.println(Arrays.toString(basket1));
        System.out.println(Arrays.toString(basket2));
        System.out.println(Arrays.toString(basket3));
        System.out.println(Arrays.toString(basket4));

        System.out.println();

        Order o1 = new Order("Иван", basket1);
        Order o2 = new Order("Иван", basket2);
        Order o3 = new Order("Мария", basket3);
        Order o4 = new Order("Иван", basket4);

        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println(o3.toString());
        System.out.println(o4.toString());

        System.out.println();

        System.out.println(o1.equals(o2)); // сравнение заказов с разным порядком товаров
        System.out.println(o1.equals(o3)); // сравнение заказов с  разными покупателями и разными товарами
        System.out.println(o1.equals(o4)); // сравнение заказов с одинаковыми покупателями и одинаковым порядком товаров


    }
}