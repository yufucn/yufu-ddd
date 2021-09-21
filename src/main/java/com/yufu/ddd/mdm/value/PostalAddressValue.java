package com.yufu.ddd.mdm.value;

import com.sun.beans.decoder.ValueObject;

/**
 * @author wang
 * @date 2021/9/21 22:58
 */
public class PostalAddressValue implements ValueObject {
    private AddressValue address;
    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public boolean isVoid() {
        return false;
    }
}
