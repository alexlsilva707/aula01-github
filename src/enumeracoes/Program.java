package enumeracoes;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);

        OrderStatus os1 = OrderStatus.valueOf("AGUARDANDO_PAGAMENTO");

        System.out.println(os1);

        System.out.println(order);
    }
}
