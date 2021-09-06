package com.yufu.ddd.mdm.value;

import com.sun.beans.decoder.ValueObject;

import java.util.Objects;

/**
 * @author wang
 * @date 2021/9/6
 */
public class EmailAddressValue implements ValueObject {

    private final String email;

    public EmailAddressValue(String email) {
        this.email = email;
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public boolean isVoid() {
        return false;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmailAddressValue)) {
            return false;
        }
        EmailAddressValue that = (EmailAddressValue) o;
        return Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail());
    }
}
