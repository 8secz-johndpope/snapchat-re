package com.mapbox.mapboxsdk.style.functions;

import com.mapbox.mapboxsdk.style.functions.stops.CategoricalStops;
import com.mapbox.mapboxsdk.style.functions.stops.ExponentialStops;
import com.mapbox.mapboxsdk.style.functions.stops.IdentityStops;
import com.mapbox.mapboxsdk.style.functions.stops.IntervalStops;
import com.mapbox.mapboxsdk.style.functions.stops.Stop.CompositeValue;
import com.mapbox.mapboxsdk.style.functions.stops.Stops;
import defpackage.alsj;
import java.util.Map;

public class Function<I, O> {
    static final String DEFAULT_VALUE_KEY = "default";
    static final String PROPERTY_KEY = "property";
    private final Stops<I, O> stops;

    Function(Stops<I, O> stops) {
        this.stops = stops;
    }

    public static <Z extends Number, I, O> CompositeFunction<Z, I, O> composite(String str, CategoricalStops<CompositeValue<Z, I>, O> categoricalStops) {
        return new CompositeFunction(str, (CategoricalStops) categoricalStops);
    }

    public static <Z extends Number, I, O> CompositeFunction<Z, I, O> composite(String str, ExponentialStops<CompositeValue<Z, I>, O> exponentialStops) {
        return new CompositeFunction(str, (ExponentialStops) exponentialStops);
    }

    public static <Z extends Number, I, O> CompositeFunction<Z, I, O> composite(String str, IntervalStops<CompositeValue<Z, I>, O> intervalStops) {
        return new CompositeFunction(str, (IntervalStops) intervalStops);
    }

    public static <I, O> SourceFunction<I, O> property(String str, CategoricalStops<I, O> categoricalStops) {
        return new SourceFunction(str, categoricalStops);
    }

    public static <I, O> SourceFunction<I, O> property(String str, ExponentialStops<I, O> exponentialStops) {
        return new SourceFunction(str, exponentialStops);
    }

    public static <T> SourceFunction<T, T> property(String str, IdentityStops<T> identityStops) {
        return new SourceFunction(str, identityStops);
    }

    public static <I, O> SourceFunction<I, O> property(String str, IntervalStops<I, O> intervalStops) {
        return new SourceFunction(str, intervalStops);
    }

    public static <Z extends Number, O> CameraFunction<Z, O> zoom(ExponentialStops<Z, O> exponentialStops) {
        return new CameraFunction((ExponentialStops) exponentialStops);
    }

    public static <Z extends Number, O> CameraFunction<Z, O> zoom(IntervalStops<Z, O> intervalStops) {
        return new CameraFunction((IntervalStops) intervalStops);
    }

    public Stops getStops() {
        return this.stops;
    }

    public <S extends Stops> S getStopsAs() {
        try {
            return this.stops;
        } catch (ClassCastException e) {
            alsj.d(String.format("Stops: %s is a different type: %s", new Object[]{this.stops.getClass(), e}), new Object[0]);
            return null;
        }
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{getClass().getSimpleName(), this.stops});
    }

    public Map<String, Object> toValueObject() {
        return this.stops.toValueObject();
    }
}
