package com.mapbox.services.android.telemetry.location;

import android.content.Context;
import com.mapbox.services.android.telemetry.location.LocationEngine.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LocationEngineProvider {
    private static final List<Type> OPTIONAL_LOCATION_ENGINES = new ArrayList<Type>() {
        {
            add(Type.GOOGLE_PLAY_SERVICES);
            add(Type.LOST);
        }
    };
    private Map<Type, LocationEngine> locationEngineDictionary;

    public LocationEngineProvider(Context context) {
        initAvailableLocationEngines(context);
    }

    private void initAvailableLocationEngines(Context context) {
        this.locationEngineDictionary = new HashMap();
        for (Entry entry : obtainDefaultLocationEnginesDictionary().entrySet()) {
            LocationEngineSupplier locationEngineSupplier = (LocationEngineSupplier) entry.getValue();
            if (locationEngineSupplier.hasDependencyOnClasspath()) {
                this.locationEngineDictionary.put(entry.getKey(), locationEngineSupplier.supply(context));
            }
        }
    }

    private LocationEngine obtainBestLocationEngine() {
        LocationEngine locationEngine = (LocationEngine) this.locationEngineDictionary.get(Type.ANDROID);
        for (Type type : OPTIONAL_LOCATION_ENGINES) {
            LocationEngine locationEngine2 = (LocationEngine) this.locationEngineDictionary.get(type);
            if (locationEngine2 != null) {
                return locationEngine2;
            }
        }
        return locationEngine;
    }

    private Map<Type, LocationEngineSupplier> obtainDefaultLocationEnginesDictionary() {
        ClasspathChecker classpathChecker = new ClasspathChecker();
        HashMap hashMap = new HashMap();
        hashMap.put(Type.GOOGLE_PLAY_SERVICES, new GoogleLocationEngineFactory(classpathChecker));
        hashMap.put(Type.ANDROID, new AndroidLocationEngineFactory());
        return hashMap;
    }

    public LocationEngine obtainBestLocationEngineAvailable() {
        return obtainBestLocationEngine();
    }

    public LocationEngine obtainLocationEngineBy(Type type) {
        return (LocationEngine) this.locationEngineDictionary.get(type);
    }
}
