package com.mapbox.mapboxsdk.style.functions.stops;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class ExponentialStops<I, O> extends IterableStops<I, O, Stop<I, O>> {
    private float base;
    private final Stop<I, O>[] stops;

    @SafeVarargs
    public ExponentialStops(Float f, Stop<I, O>... stopArr) {
        this.base = f != null ? f.floatValue() : 1.0f;
        this.stops = stopArr;
    }

    @SafeVarargs
    public ExponentialStops(Stop<I, O>... stopArr) {
        this(null, stopArr);
    }

    public float getBase() {
        return this.base;
    }

    public String getTypeName() {
        return "exponential";
    }

    public Iterator<Stop<I, O>> iterator() {
        return Arrays.asList(this.stops).iterator();
    }

    public int size() {
        return this.stops.length;
    }

    public Map<String, Object> toValueObject() {
        Map toValueObject = super.toValueObject();
        toValueObject.put("base", Float.valueOf(this.base));
        toValueObject.put("stops", toValueObjects(this.stops));
        return toValueObject;
    }

    public ExponentialStops<I, O> withBase(float f) {
        this.base = f;
        return this;
    }
}
