package com.mapbox.mapboxsdk.style.functions.stops;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class CategoricalStops<I, O> extends IterableStops<I, O, Stop<I, O>> {
    private final Stop<I, O>[] stops;

    @SafeVarargs
    public CategoricalStops(Stop<I, O>... stopArr) {
        this.stops = stopArr;
    }

    public String getTypeName() {
        return "categorical";
    }

    public Iterator<Stop<I, O>> iterator() {
        return Arrays.asList(this.stops).iterator();
    }

    public int size() {
        return this.stops.length;
    }

    public Map<String, Object> toValueObject() {
        Map toValueObject = super.toValueObject();
        toValueObject.put("stops", toValueObjects(this.stops));
        return toValueObject;
    }
}
