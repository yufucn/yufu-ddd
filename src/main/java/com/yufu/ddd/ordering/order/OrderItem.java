package com.yufu.ddd.ordering.order;

import com.yufu.ddd.mdm.value.MoneyValue;
import com.yufu.ddd.ordering.Entity;
import com.yufu.ddd.ordering.product.ProductId;

/**
 * @author wang
 * @date 2021/9/21 22:46
 */
public class OrderItem extends Entity<Long> {
    private ProductId product;
    private int quantity;
    private MoneyValue price;
    private MoneyValue subTotal;
}
