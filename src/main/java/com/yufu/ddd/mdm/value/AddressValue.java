package com.yufu.ddd.mdm.value;

import com.sun.beans.decoder.ValueObject;

import java.util.Objects;

/**
 * @author wang
 * @date 2021/9/6
 */
public class AddressValue implements ValueObject {

    private final String country;
    private final String state;
    private final String city;
    private final String street;
    private final String zipCode;

    public AddressValue(String country,
                        String state,
                        String city,
                        String street,
                        String zipCode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddressValue that = (AddressValue) o;
        return Objects.equals(country, that.country) &&
                Objects.equals(state, that.state) &&
                Objects.equals(city, that.city) &&
                Objects.equals(street, that.street) &&
                Objects.equals(zipCode, that.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, state, city, street, zipCode);
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public boolean isVoid() {
        return false;
    }
}
