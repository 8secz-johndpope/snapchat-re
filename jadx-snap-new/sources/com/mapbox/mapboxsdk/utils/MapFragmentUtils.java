package com.mapbox.mapboxsdk.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.maps.MapboxMapOptions;

public class MapFragmentUtils {
    public static Bundle createFragmentArgs(MapboxMapOptions mapboxMapOptions) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(MapboxConstants.FRAG_ARG_MAPBOXMAPOPTIONS, mapboxMapOptions);
        return bundle;
    }

    private static MapboxMapOptions loadDefaultMyLocationViewDrawables(Context context, MapboxMapOptions mapboxMapOptions) {
        Drawable myLocationForegroundDrawable = mapboxMapOptions.getMyLocationForegroundDrawable();
        Drawable myLocationForegroundBearingDrawable = mapboxMapOptions.getMyLocationForegroundBearingDrawable();
        if (myLocationForegroundDrawable == null || myLocationForegroundBearingDrawable == null) {
            if (myLocationForegroundDrawable == null) {
                myLocationForegroundDrawable = ContextCompat.getDrawable(context, R.drawable.mapbox_mylocation_icon_default);
            }
            if (myLocationForegroundBearingDrawable == null) {
                myLocationForegroundBearingDrawable = ContextCompat.getDrawable(context, R.drawable.mapbox_mylocation_icon_bearing);
            }
            mapboxMapOptions.myLocationForegroundDrawables(myLocationForegroundDrawable, myLocationForegroundBearingDrawable);
        }
        if (mapboxMapOptions.getMyLocationBackgroundDrawable() == null) {
            mapboxMapOptions.myLocationBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.mapbox_mylocation_bg_shape));
        }
        return mapboxMapOptions;
    }

    public static MapboxMapOptions resolveArgs(Context context, Bundle bundle) {
        MapboxMapOptions mapboxMapOptions;
        if (bundle != null) {
            String str = MapboxConstants.FRAG_ARG_MAPBOXMAPOPTIONS;
            if (bundle.containsKey(str)) {
                mapboxMapOptions = (MapboxMapOptions) bundle.getParcelable(str);
                return loadDefaultMyLocationViewDrawables(context, mapboxMapOptions);
            }
        }
        mapboxMapOptions = MapboxMapOptions.createFromAttributes(context, null, false);
        return loadDefaultMyLocationViewDrawables(context, mapboxMapOptions);
    }
}
