package com.mapbox.mapboxsdk.style.layers;

import com.mapbox.mapboxsdk.exceptions.ConversionException;
import com.mapbox.mapboxsdk.style.functions.Function;
import com.mapbox.mapboxsdk.utils.ColorUtils;
import defpackage.alsj;

public class PropertyValue<T> {
    public final String name;
    public final T value;

    public PropertyValue(String str, T t) {
        this.name = str;
        this.value = t;
    }

    public Integer getColorInt() {
        if (isValue()) {
            Object obj = this.value;
            if (obj instanceof String) {
                try {
                    return Integer.valueOf(ColorUtils.rgbaToColor((String) obj));
                } catch (ConversionException e) {
                    alsj.d("%s could not be converted to a Color int: %s", this.name, e.getMessage());
                    return null;
                }
            }
        }
        alsj.d("%s is not a String value and can not be converted to a color it", this.name);
        return null;
    }

    public Function<?, T> getFunction() {
        if (isFunction()) {
            return (Function) this.value;
        }
        alsj.c("not a function, try value", new Object[0]);
        return null;
    }

    public T getValue() {
        if (isValue()) {
            return this.value;
        }
        alsj.c("not a value, try function", new Object[0]);
        return null;
    }

    public boolean isFunction() {
        return !isNull() && (this.value instanceof Function);
    }

    public boolean isNull() {
        return this.value == null;
    }

    public boolean isValue() {
        return (isNull() || isFunction()) ? false : true;
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.name, this.value});
    }
}
