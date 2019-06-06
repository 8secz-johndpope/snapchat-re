package com.mapbox.mapboxsdk.customlayer;

import defpackage.cgh;
import defpackage.cgh.a;
import defpackage.cgh.b;

public class MapboxCustomMapFactory implements a {
    public cgh newLayer(String str, String str2, b bVar) {
        return new WrappedCustomLayer(str, str2, bVar);
    }
}
