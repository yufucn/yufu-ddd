package com.yufu.ddd.ordering.aggregate;

import com.yufu.ddd.mdm.value.FullNameValue;

/**
 * @author wang
 * @date 2021/9/21 22:39
 */
public class Buyer extends AggregateRoot<BuyerId> {
    private FullNameValue name;
}
