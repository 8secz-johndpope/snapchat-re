package com.snap.core.db.column;

import defpackage.akbl;
import defpackage.akcs;

final class GeofilterMetadataColumnAdapter$encode$1 extends akcs implements akbl<String, CharSequence> {
    public static final GeofilterMetadataColumnAdapter$encode$1 INSTANCE = new GeofilterMetadataColumnAdapter$encode$1();

    GeofilterMetadataColumnAdapter$encode$1() {
        super(1);
    }

    public final CharSequence invoke(String str) {
        return str == null ? "" : str;
    }
}
