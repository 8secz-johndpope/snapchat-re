package com.snap.core.db.column;

import defpackage.ainu;
import defpackage.ajym;
import defpackage.ajyu;
import defpackage.akcr;
import defpackage.akgb;
import defpackage.akgc;
import defpackage.ppy;
import java.util.List;

public final class SnappableLensMetadataColumnAdapter implements ainu<SnappableLensMetadata, String> {
    public final SnappableLensMetadata decode(String str) {
        if (str != null) {
            List a = akgc.a((CharSequence) str, new String[]{ppy.b}, 0, 6);
            if (a != null) {
                SnappableLensMetadata snappableLensMetadata = null;
                if (a.size() == 2) {
                    Object obj = "null";
                    String str2 = (akgb.a((CharSequence) a.get(0)) || akcr.a((String) a.get(0), obj)) ? null : (String) a.get(0);
                    Object obj2 = (String) a.get(1);
                    if (!(akgb.a((CharSequence) obj2) || akcr.a(obj2, obj))) {
                        snappableLensMetadata = new SnappableLensMetadata(str2, obj2);
                    }
                }
                if (snappableLensMetadata != null) {
                    return snappableLensMetadata;
                }
            }
        }
        return SnappableLensMetadata.Companion.getNoop();
    }

    public final String encode(SnappableLensMetadata snappableLensMetadata) {
        akcr.b(snappableLensMetadata, "value");
        return ajyu.a((Iterable) ajym.b((Object[]) new String[]{snappableLensMetadata.getLensId(), snappableLensMetadata.getLensMetadata()}), (CharSequence) ppy.b, null, null, 0, null, null, 62);
    }
}
