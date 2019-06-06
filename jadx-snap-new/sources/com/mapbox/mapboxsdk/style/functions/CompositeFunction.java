package com.mapbox.mapboxsdk.style.functions;

import com.mapbox.mapboxsdk.style.functions.stops.CategoricalStops;
import com.mapbox.mapboxsdk.style.functions.stops.ExponentialStops;
import com.mapbox.mapboxsdk.style.functions.stops.IntervalStops;
import com.mapbox.mapboxsdk.style.functions.stops.Stop.CompositeValue;
import com.mapbox.mapboxsdk.style.functions.stops.Stops;
import com.mapbox.mapboxsdk.style.layers.PropertyValue;
import java.util.Map;

public class CompositeFunction<Z extends Number, I, O> extends Function<CompositeValue<Z, I>, O> {
    private PropertyValue<O> defaultValue;
    private final String property;

    private CompositeFunction(O o, String str, Stops<CompositeValue<Z, I>, O> stops) {
        super(stops);
        this.defaultValue = new PropertyValue(str, o);
        this.property = str;
    }

    CompositeFunction(String str, CategoricalStops<CompositeValue<Z, I>, O> categoricalStops) {
        this(null, str, categoricalStops);
    }

    CompositeFunction(String str, ExponentialStops<CompositeValue<Z, I>, O> exponentialStops) {
        this(null, str, exponentialStops);
    }

    CompositeFunction(String str, IntervalStops<CompositeValue<Z, I>, O> intervalStops) {
        this(null, str, intervalStops);
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

    public CompositeFunction<Z, I, O> withDefaultValue(PropertyValue<O> propertyValue) {
        this.defaultValue = propertyValue;
        return this;
    }
}
