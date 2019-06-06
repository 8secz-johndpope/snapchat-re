package com.mapbox.mapboxsdk.style.functions;

import com.mapbox.mapboxsdk.style.functions.stops.Stops;
import com.mapbox.mapboxsdk.style.layers.PropertyValue;
import java.util.Map;

public class SourceFunction<I, O> extends Function<I, O> {
    private PropertyValue<O> defaultValue;
    private final String property;

    private SourceFunction(O o, String str, Stops<I, O> stops) {
        super(stops);
        this.property = str;
        this.defaultValue = o != null ? new PropertyValue(str, o) : null;
    }

    SourceFunction(String str, Stops<I, O> stops) {
        this(null, str, stops);
    }

    public PropertyValue<O> getDefaultValue() {
        return this.defaultValue;
    }

    public String getProperty() {
        return this.property;
    }

    public Map<String, Object> toValueObject() {
        Map toValueObject = super.toValueObject();
        toValueObject.put("property", this.property);
        PropertyValue propertyValue = this.defaultValue;
        if (propertyValue != null) {
            toValueObject.put("default", propertyValue.value);
        }
        return toValueObject;
    }

    public SourceFunction<I, O> withDefaultValue(PropertyValue<O> propertyValue) {
        this.defaultValue = propertyValue;
        return this;
    }
}
