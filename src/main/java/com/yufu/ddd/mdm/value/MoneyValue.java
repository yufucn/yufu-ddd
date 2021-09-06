package com.yufu.ddd.mdm.value;

import com.sun.beans.decoder.ValueObject;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

/**
 * @author wang
 * @date 2021/9/6
 */
public class MoneyValue implements ValueObject {
    private final BigDecimal amount;
    private final Currency currency;

    public MoneyValue(
            BigDecimal amount,
            Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public MoneyValue add(MoneyValue other) {
        assertSameCurrency(other);
        return new MoneyValue(amount.add(other.amount), currency);
    }

    public MoneyValue subtract(MoneyValue other) {
        assertSameCurrency(other);
        return new MoneyValue(amount.subtract(other.amount), currency);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    private void assertSameCurrency(MoneyValue other) {
        if (!other.currency.equals(this.currency)) {
            throw new IllegalArgumentException("Money objects must have the same currency");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MoneyValue)) {
            return false;
        }
        MoneyValue that = (MoneyValue) o;
        return Objects.equals(getAmount(), that.getAmount()) &&
                Objects.equals(getCurrency(), that.getCurrency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmount(), getCurrency());
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
