package com.mapbox.mapboxsdk.style.functions;

import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.style.functions.stops.ExponentialStops;
import com.mapbox.mapboxsdk.style.functions.stops.IntervalStops;
import com.mapbox.mapboxsdk.style.functions.stops.Stops;

public class CameraFunction<I extends Number, O> extends Function<I, O> {
    CameraFunction(ExponentialStops<I, O> exponentialStops) {
        super(exponentialStops);
    }

    CameraFunction(IntervalStops<I, O> intervalStops) {
        super(intervalStops);
    }

    @Keep
    private CameraFunction(Stops<I, O> stops) {
        super(stops);
    }
}
