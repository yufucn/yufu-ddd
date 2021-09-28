package com.yufu.ddd.ordering.buyer;

import com.yufu.ddd.mdm.value.FullNameValue;
import com.yufu.ddd.ordering.AggregateRoot;

/**
 * @author wang
 * @date 2021/9/21 22:39
 */
public class Buyer extends AggregateRoot<BuyerId> {
    private FullNameValue name;
}
