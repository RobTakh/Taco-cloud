package sia.Tacocloud.data;

import sia.Tacocloud.Order;

public interface OrderRepository {
    Order save(Order order);
}
