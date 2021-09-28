package com.yufu.ddd.ordering.order;

import com.yufu.ddd.mdm.value.MoneyValue;
import com.yufu.ddd.ordering.AggregateRoot;
import com.yufu.ddd.ordering.buyer.BuyerId;

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
