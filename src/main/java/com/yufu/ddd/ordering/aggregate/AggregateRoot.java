package com.yufu.ddd.ordering.aggregate;

/**
 * @author wang
 * @date 2021/9/21 22:29
 */
public abstract class AggregateRoot<ID> {
    private ID id;

    public ID getId() {
        return id;
    }
}
