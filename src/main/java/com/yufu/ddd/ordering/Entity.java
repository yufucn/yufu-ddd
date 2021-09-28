package com.yufu.ddd.ordering;

/**
 * @author wang
 * @date 2021/9/21 22:50
 */
public abstract class Entity<T> {
    private T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
