package learning;

import entities.OrderStatus;
import learningNew02.Order;
import java.util.Date;

public class Enumeração {
    static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
