package com.mapbox.mapboxsdk.style.functions.stops;

import com.mapbox.mapboxsdk.style.layers.PropertyValue;
import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.HashMap;
import java.util.Map;

public class Stop<I, O> {
    public final I in;
    public final O out;

    public static class CompositeValue<Z extends Number, V> {
        public final V value;
        public final Z zoom;

        CompositeValue(Z z, V v) {
            this.zoom = z;
            this.value = v;
        }

        public String toString() {
            return String.format("[zoom: %s, value: %s]", new Object[]{this.zoom, this.value});
        }

        /* Access modifiers changed, original: 0000 */
        public Map<String, Object> toValueObject() {
            HashMap hashMap = new HashMap();
            hashMap.put(MapboxEvent.KEY_ZOOM, this.zoom);
            hashMap.put("value", this.value);
            return hashMap;
        }
    }

    Stop(I i, O o) {
        this.in = i;
        this.out = o;
    }

    public static <Z extends Number, I, O> Stop<CompositeValue<Z, I>, O> stop(Z z, I i, PropertyValue<O> propertyValue) {
        return new Stop(new CompositeValue(z, i), propertyValue.value);
    }

    public static <I, O> Stop<I, O> stop(I i, PropertyValue<O> propertyValue) {
        return new Stop(i, propertyValue.value);
    }

    public String toString() {
        return String.format("[%s, %s]", new Object[]{this.in, this.out});
    }

    /* Access modifiers changed, original: 0000 */
    public Object[] toValueObject() {
        Object[] objArr = new Object[2];
        Object obj = this.in;
        if (obj instanceof CompositeValue) {
            obj = ((CompositeValue) obj).toValueObject();
        }
        objArr[0] = obj;
        objArr[1] = this.out;
        return objArr;
    }
}
