package com.snap.core.db.column;

import defpackage.ainu;
import defpackage.ajym;
import defpackage.ajyu;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akgc;
import defpackage.ppy;
import java.util.List;

public final class GeofilterMetadataColumnAdapter implements ainu<GeofilterMetadata, String> {
    private final String convertNullableString(String str) {
        CharSequence charSequence = str;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        return (obj != null || akcr.a((Object) str, (Object) "null")) ? null : str;
    }

    public final GeofilterMetadata decode(String str) {
        if (str != null) {
            List a = akgc.a((CharSequence) str, new String[]{ppy.b}, 0, 6);
            if (a != null) {
                return new GeofilterMetadata(convertNullableString((String) a.get(0)), convertNullableString((String) a.get(1)), convertNullableString((String) a.get(2)), convertNullableString((String) a.get(3)), convertNullableString((String) a.get(4)));
            }
        }
        return new GeofilterMetadata(null, null, null, null, null, 31, null);
    }

    public final String encode(GeofilterMetadata geofilterMetadata) {
        akcr.b(geofilterMetadata, "value");
        return ajyu.a((Iterable) ajym.b((Object[]) new String[]{geofilterMetadata.getFilterId(), geofilterMetadata.getLensId(), geofilterMetadata.getVenueId(), geofilterMetadata.getUnlockablesSnapInfo(), geofilterMetadata.getEncGeoData()}), (CharSequence) ppy.b, null, null, 0, null, (akbl) GeofilterMetadataColumnAdapter$encode$1.INSTANCE, 30);
    }
}
