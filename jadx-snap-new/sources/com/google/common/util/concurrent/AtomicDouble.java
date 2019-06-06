package com.google.common.util.concurrent;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicDouble extends Number implements Serializable {
    private transient AtomicLong value;

    public AtomicDouble() {
        this(0.0d);
    }

    public AtomicDouble(double d) {
        this.value = new AtomicLong(Double.doubleToRawLongBits(d));
    }

    public double doubleValue() {
        return get();
    }

    public float floatValue() {
        return (float) get();
    }

    public final double get() {
        return Double.longBitsToDouble(this.value.get());
    }

    public int intValue() {
        return (int) get();
    }

    public long longValue() {
        return (long) get();
    }

    public final void set(double d) {
        this.value.set(Double.doubleToRawLongBits(d));
    }

    public String toString() {
        return Double.toString(get());
    }
}
