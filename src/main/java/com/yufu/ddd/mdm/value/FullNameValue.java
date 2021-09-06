package com.yufu.ddd.mdm.value;

import com.sun.beans.decoder.ValueObject;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * @author wang
 * @date 2021/9/6
 */
public class FullNameValue implements ValueObject {

    private final String firstname;
    private final String lastname;

    public FullNameValue(
            @NotNull String firstname,
            @NotNull String lastname) {
        this.firstname = Objects.requireNonNull(firstname);
        this.lastname = Objects.requireNonNull(lastname);
    }


    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public boolean isVoid() {
        return false;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FullNameValue that = (FullNameValue) o;
        return Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }
}
