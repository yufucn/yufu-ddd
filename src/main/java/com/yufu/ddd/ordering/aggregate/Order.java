package com.yufu.ddd.ordering.aggregate;

import com.yufu.ddd.mdm.value.MoneyValue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wang
 * @date 2021/9/21 22:29
 */
public class Order extends AggregateRoot<OrderId> {

    private LocalDate orderDate;
    private BuyerId buyer;
    private MoneyValue total;
    private List<OrderItem> items = new ArrayList<>();

}
