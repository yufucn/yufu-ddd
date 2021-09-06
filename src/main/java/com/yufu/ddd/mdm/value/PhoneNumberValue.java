package com.yufu.ddd.mdm.value;

import com.sun.beans.decoder.ValueObject;

import java.util.Objects;

/**
 * @author wang
 * @date 2021/9/6
 */
public class PhoneNumberValue implements ValueObject {

    private final String code;
    private final String number;

    public PhoneNumberValue(String code, String number) {
        this.code = code;
        this.number = number;
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public boolean isVoid() {
        return false;
    }

    public String getNumber() {
        return number;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PhoneNumberValue)) {
            return false;
        }
        PhoneNumberValue that = (PhoneNumberValue) o;
        return Objects.equals(getCode(), that.getCode()) &&
                Objects.equals(getNumber(), that.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getNumber());
    }
}
