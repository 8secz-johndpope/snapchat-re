package com.mapbox.mapboxsdk.style.functions.stops;

import java.util.HashMap;
import java.util.Map;

public abstract class Stops<I, O> {
    @SafeVarargs
    public static <I, O> CategoricalStops<I, O> categorical(Stop<I, O>... stopArr) {
        return new CategoricalStops(stopArr);
    }

    @SafeVarargs
    public static <I, O> ExponentialStops<I, O> exponential(Stop<I, O>... stopArr) {
        return new ExponentialStops(stopArr);
    }

    public static <T> IdentityStops<T> identity() {
        return new IdentityStops();
    }

    @SafeVarargs
    public static <I, O> IntervalStops<I, O> interval(Stop<I, O>... stopArr) {
        return new IntervalStops(stopArr);
    }

    public abstract String getTypeName();

    public String toString() {
        return getTypeName();
    }

    public Map<String, Object> toValueObject() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", getTypeName());
        return hashMap;
    }
}
